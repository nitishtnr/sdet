package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
	 WebDriver driver;
	    WebDriverWait wait;
	
	@BeforeMethod
	    public void beforeMethod() {
	        driver = new FirefoxDriver();
	        driver.get("https://alchemy.hguy.co/lms");
	    }

	    @Test
	    
	    public void exampleTestCase() {
	        String title = driver.getTitle();
	        System.out.println(title);	       
	       WebElement button= driver.findElement(By.xpath("//div[@class=\"main-header-bar-navigation\"]//li[2]"));
	       button.click();
	        System.out.println("Page heading is: " +  driver.getTitle());
	        
	        Assert.assertEquals("All Courses – Alchemy LMS", driver.getTitle());
	        List<WebElement> cols= driver.findElements(By.cssSelector("div[class*=ld-course-list-items]>div"));	        
	        System.out.println("Number of courses exist"+cols.size());        
	    }

	    @AfterMethod
	    public void afterMethod() {
	        //Close the browser
	      driver.quit();
	    }
}
