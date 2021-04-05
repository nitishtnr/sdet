package Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
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
        
       List<WebElement> elements= driver.findElements(By.cssSelector("h3.entry-title"));
        System.out.println("Page heading is: " + elements.get(1).getText());
        
        Assert.assertEquals("Email Marketing Strategies", elements.get(1).getText());
                    
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}