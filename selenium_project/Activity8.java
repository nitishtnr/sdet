package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	 WebDriver driver;
	 
	@BeforeMethod
	    public void beforeMethod() {
	        driver = new FirefoxDriver();
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test	    
	    public void exampleTestCase() {
	      	       
	       WebElement button= driver.findElement(By.xpath("//div[@class=\"main-header-bar-navigation\"]//li[4]"));
	       button.click();
          driver.findElement(By.xpath("//div[@class='wpforms-field-container']/div[1]/input")).sendKeys("user1");
          driver.findElement(By.xpath("//div[@class='wpforms-field-container']/div[2]/input")).sendKeys("test@mail.com");
          driver.findElement(By.xpath("//div[@class='wpforms-field-container']/div[3]/input")).sendKeys("query ");
          driver.findElement(By.xpath("//div[@class='wpforms-field-container']/div[4]/textarea")).sendKeys("timeline for the course?");
          driver.findElement(By.xpath("//div[@class='wpforms-submit-container']/button")).click();
          WebDriverWait wait = new WebDriverWait (driver, 20);
          wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("wpforms-confirmation-8")), "Thanks for contacting us! We will be in touch with you shortly"));
          Assert.assertEquals("Thanks for contacting us! We will be in touch with you shortly.",driver.findElement(By.id("wpforms-confirmation-8")).getText());
          
	    }

	    @AfterMethod
	    public void afterMethod() {
	      driver.quit();
	    }
}
