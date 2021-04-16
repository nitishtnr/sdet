package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination6 {
	WebDriver driver;
	WebDriverWait wait;
	@Given("^open the browser to the AlchemyCRM site and login$")
	public void Method1() {
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
	}
	@And("^Navigate to Sales->Leads->Create Lead$")
	public void Method2() {
    //driver.findElement(By.id("grouptab_0")).click();
    driver.findElement(By.id("grouptab_0")).click();
    driver.findElement(By.linkText("Leads")).click();
	}
	@When("^Fill in the necessary details to create lead accounts using the values passed from the feature file$")

	public void Method3() throws InterruptedException {
		Thread.sleep(10000);
	    driver.findElement(By.partialLinkText("Create Lead")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.id("last_name")).sendKeys("Kundu");
	 }
	@And("^Click Save to Finish$")
	public void Method4() {
		driver.findElement(By.id("SAVE")).click();
	}
	@And("^Navigate to the view Leads page to see results$")
	public void Method5() {
		driver.findElement(By.linkText("View Leads"));
		}
    @Then ("^Close the browser$")
    public void Method7() {
    	driver.close();
    }
}