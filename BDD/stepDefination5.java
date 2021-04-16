package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepDefination5 {
	WebDriver driver;
	WebDriverWait wait;

	
	@Given("^Open the browser to the Alchemy CRM  site and login$")
	public void Method1() {
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
	}
	@And("^Count the number of Dashlets on the homepage$")
	public void Method2() {
	List<WebElement> rows=driver.findElements(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[1]/ul/li"));
	List<WebElement> rows1=driver.findElements(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]/ul/li"));
	}
		
	@When ("^Print the number and title of each Dashlet into the console$")
		public void method3() {
		List<WebElement> rows=driver.findElements(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[1]/ul/li"));
		List<WebElement> rows1=driver.findElements(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td[2]/ul/li"));
			for (WebElement element:rows) {
				System.out.println("Element is:"+element.getText());
				}
			for (WebElement element1:rows1) {
				System.out.println("Element is:"+element1.getText());
				}
			System.out.println("The no of rows:"+rows1+rows);
		
	}
	
	@And ("^Close the Browser$")
	public void method4() {
		driver.close();
	}
}