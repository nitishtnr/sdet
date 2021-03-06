package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefination12 {
	WebDriver driver;
	WebDriverWait wait;
	@Given("^Open alongwith browser the OrangeHRM page and login with credentials provided$")
	public void Method1() {
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();	
		}
	
	@And("^Navigate to Recruitment page$")
	public void Method2() {
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();

  }
	@And("^Click the Vacancies menu item to navigate to the vacancies page$")
    public void Method3() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
	 }
	

	
	@And("^Click the Add button to navigate to the Add Job Vacancy form$")
	public void Method5() {
		driver.findElement(By.id("btnAdd")).click();
		

	}
	@Then("^Fill out \"(.*)\" along with \"(.*)\"$")
	public void Method7(String VacancyName, String HiringManager) {
        driver.findElement(By.id("addJobVacancy_name")).sendKeys(VacancyName);
		driver.findElement(By.id("addJobVacancy_hiringManager")).sendKeys(HiringManager);
		Select select = new Select(driver.findElement(By.id("addJobVacancy_jobTitle")));
		select.selectByValue("3");
		

	}
	@And ("^Click on the Save button to save the vacancy$")
    public void Method121() {
		driver.findElement (By.id("btnSave")).click();
    }
	@Then ("^Verify that the vacancy has been created$")
    public void Method122() {
		 driver.findElement(By.cssSelector("#menu_recruitment_viewRecruitmentModule")).click();
		 driver.findElement(By.linkText("Vacancies")).click();
		 Select select = new Select(driver.findElement(By.id("vacancySearch_jobTitle")));
		 select.selectByVisibleText("DevOps Engineer");

		 
		
	}
	 @And ("^Disarm the browser$")
	 public void Method123() {
		driver.close();
	 }
		 
}