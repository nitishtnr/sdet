package stepDefinations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	WebDriverWait wait;
	WebDriver driver;
	
@cucumber.api.java.en.Given("^user open the Browser and Navigate to Alchemy URL$")
public void user_open_the_browser_and_Navigate_to_AlchemyURL() {
	driver= new FirefoxDriver();
	wait=new WebDriverWait(driver,15);
	driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement l2=driver.findElement(By.id("user_login"));
	l2.sendKeys("root");
	WebElement m3=driver.findElement(By.id("user_pass"));
	m3.sendKeys("pa$$w0rd");
	driver.findElement(By.id("wp-submit")).click();
	
   
    }


@When("^user is able to login and locate the left hand menu and click the menu item that says \"(.*)\"$")
public void user_is_able_to_login_and_locate_the_left_hand_menu_and_click_the_menu_item_that_says(String string) {
	WebElement h=driver.findElement(By.partialLinkText("Users"));
	h.click();
    
    }
@And("^user is able to locate the \"(.*)\" button and click it$")
public void user_is_able_to_locate_the_button_and_click_it(String string) {
	WebElement g=driver.findElement(By.linkText("Add New"));
	g.click();
   
}
@And("^user is able to fill in the necessary details and click on \"(.*)\"$")
public void user_is_able_to_fill_in_the_necessary_details_and_click_on(String string) throws InterruptedException {
	WebElement m=driver.findElement(By.id("user_login"));
	m.sendKeys("Ankit1234569");
	WebElement n=driver.findElement(By.id("email"));
	n.sendKeys("foo46@yahoo.co.in");
	Thread.sleep(10000);
	WebElement g=driver.findElement(By.id("createusersub"));
	g.click();
	//WebElement g3=driver.findElement(By.xpath("//button[@class='button wp-hide-pw hide-if-no-js']"));
	//g3.sendKeys("opnayyar");
    
}
@Then("^verify that user was created$")
public void verify_that_user_was_created() {
	WebElement l=driver.findElement(By.id("user-search-input"));
	l.sendKeys("Ankit1234568");
	WebElement l1=driver.findElement(By.id("search-submit"));
	l1.click();
    
}
@And("^close the browser$")
public void close_the_browser() {
	driver.close();
    
}


}