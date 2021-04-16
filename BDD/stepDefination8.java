package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefination8 {

	WebDriver driver;
	WebDriverWait wait;
	@Given("^Log in  to the Alchemy CRM Site by opening the browser$")
	public void Method1() {
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
	}
	@And("^Navigate to All->Products->Create Product$")
	public void Method2() {
    //driver.findElement(By.id("grouptab_0")).click();
    Select select = new Select(driver.findElement(By.id("grouptab_5")));
    select.selectByVisibleText("Products");
    driver.findElement(By.linkText("Create Product")).click();
    
    
	}
	@And("^Retrieve information about the \"(.*)\"  with \"(.*)\" from an Examples table in the feature file and Using the data from the table enter the details of the product$")

	public void Method3(String product ,String price) {
	    driver.findElement(By.id("name")).sendKeys(product);
	    driver.findElement(By.id("price")).sendKeys(price);
	 }
	

	
	@And("^Click the save button$")
	public void Method5() {
		driver.findElement(By.id("SAVE")).click();
	}
	@And("^ Go to the \"View Products\" page to see all products listed$")
	public void Method7(String product) {
		driver.findElement(By.partialLinkText("View Products"));
		driver.findElement(By.partialLinkText(product));
	}
	@Then ("^disable the browser$")
    public void Method121() {
    	driver.close();
    }
}