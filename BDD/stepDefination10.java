package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefination10 {
	
	WebDriver driver;
	WebDriverWait wait;
	@Given("^Open the OrangeHRM website and login with credentials provided$")
	public void Method1() {
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.id("btnLogin")).click();	
		}
	
	@And("^Navigate to the Recruitment page and click on the Add button to add candidate information$")
	public void Method2() {
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		driver.findElement(By.linkText("Candidates")).click();
		driver.findElement(By.id("btnAdd")).click();

  }
	@And("^On the next page fill in the details of the candidate$")
    public void Method3() {
		driver.findElement(By.id("addCandidate_firstName")).sendKeys("ANK");
		driver.findElement(By.id("addCandidate_lastName")).sendKeys("KUN");
		driver.findElement(By.id("addCandidate_email")).sendKeys("put.gmail.com");
	 }
	

	
	@And("^Upload a resume docx or pdf to the form$")
	public void Method5() {
		WebElement h=driver.findElement(By.id("addCandidate_resume"));
		h.sendKeys("C:\\Users\\AnkitKundu\\Desktop\\342.png");
		

	}
	@And("^Click the Save button$")
	public void Method7() {
		driver.findElement(By.id("btnSave")).click();
		

	}
	@And ("^Navigate back to the Recruitments page to confirm candidate entry$")
    public void Method121() {
		driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
		driver.findElement(By.id("candidateSearch_candidateName")).sendKeys("ANKKUN");
		driver.findElement(By.id("btnSrch")).click();
    }

	
	 @And ("^Close and quit from the browser$")
	 public void Method123() {
		driver.close();
	 }
		 
	 }
