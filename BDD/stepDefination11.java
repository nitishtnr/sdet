package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefination11 {
	WebDriver driver;
	WebDriverWait wait;
	@Given("^Go to the OrangeHRM page and login with credentials provided$")
	public void Method1() {
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();	
		}
	@And("^Find the PIM option in the menu and click$")
	public void Method2() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
}
	@And("^Click the Add button to add a new Employee$")
	public void Method3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Add Employee")).click();
	}
	
	@And("^Make sure the Create Login Details checkbox is checked$")
	public void Method4() {
		driver.findElement(By.id("chkLogin")).click();
		}
	 @And ("^Fill in the required fields using the data from the Examples table using \"(.*)\" and \"(.*)\" along with \"(.*)\" and click Save$")
	 public void Method5(String FirstName,String LastName, String UserName) {
		 driver.findElement (By.id("firstName")).sendKeys(FirstName);
		 driver.findElement(By.id("lastName")).sendKeys(LastName);
		 driver.findElement(By.id("user_name")).sendKeys(UserName);
		 driver.findElement(By.id("btnSave")).click();
	 }
	 
	 @Then("^Verify that the employees with \"(.*)\" have been created$")
	 public void Method6(String FirstName) {
		 driver.findElement (By.id("menu_pim_viewEmployeeList")).click();
		 driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(FirstName);
		 Select select = new Select(driver.findElement(By.id("empsearch_job_title")));
		 select.selectByValue("3");
		 driver.findElement(By.id("searchBtn")).click();
		 
	 }
	 
	 @And("^Close with the browser$")
	 public void Method7() {
		 driver.close();
	 }
	 }