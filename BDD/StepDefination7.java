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

	public class StepDefination7 {
		WebDriver driver;
		WebDriverWait wait;
		@Given("^Open the browser to the Alchemy CRM site and login$")
		public void Method1() {
			driver=new FirefoxDriver();
			driver.get("https://alchemy.hguy.co/crm");
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("bigbutton")).click();
		}
		@And("^Navigate to Activities->Meetings->Schedule a Meeting$")
		public void Method2() throws InterruptedException {
	    //driver.findElement(By.id("grouptab_0")).click();
	    driver.findElement(By.id("grouptab_3")).click();
	    driver.findElement(By.id("moduleTab_9_Meetings")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("Schedule Meeting")).click();
	    
		}
		@And("^Enter the details of the meeting$")

		public void Method3() throws InterruptedException {
			Thread.sleep(5000);
		    driver.findElement(By.id("name")).sendKeys("AKU");
		 }
		@And("^search for \"(.*)\" and add them to meeting and the names to be searched will be written in the feature file in a Examples Table$")
		public void Method4(String members) throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.id("search_first_name")).sendKeys(members);
			driver.findElement(By.id("invitees_search")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("invitees_add_1")).click();
			
			}
		
		@And("^Click save$")
		public void Method5() {
			driver.findElement(By.id("SAVE_HEADER")).click();
		}
		@And("^Navigate to Views Meetings page and confirm creation of the meeting$")
		public void Method7() {
			driver.findElement(By.partialLinkText("View Meetings"));
			driver.findElement(By.partialLinkText("AK"));
		}
		@Then ("^quit the browser$")
	    public void Method121() {
	    	driver.close();
	    }
	}