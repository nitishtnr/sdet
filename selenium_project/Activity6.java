package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
WebDriver driver;
    
    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }

    @Test
    @Parameters({"username", "password"})
    public void exampleTestCase(String username, String password) {
        String title = driver.getTitle();
       System.out.println(title);
       WebElement button= driver.findElement(By.xpath("//div[@class=\"main-header-bar-navigation\"]//li[5]"));
       button.click();
        System.out.println(driver.getTitle());

        Assert.assertEquals("My Account – Alchemy LMS", driver.getTitle());
        
        WebElement login= driver.findElement(By.linkText("Login"));
        login.click();
        System.out.println(driver.getTitle()); 
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//ul[@id='wp-admin-bar-top-secondary']/li[@id='wp-admin-bar-my-account']/a[contains(text(),\"Howdy\")]")).isDisplayed());
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}