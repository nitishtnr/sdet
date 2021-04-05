package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
   WebDriver driver;
   
   @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void exampleTestCase() {
        String title = driver.getTitle();
        System.out.println(title);
        WebElement button= driver.findElement(By.xpath("//div[@class=\"main-header-bar-navigation\"]//li[5]"));
       button.click();     
        System.out.println("Page heading two is: " +  driver.getTitle());
        Assert.assertEquals("My Account – Alchemy LMS", driver.getTitle());
                    
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}