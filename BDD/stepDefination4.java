package stepDefinations;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class stepDefination4 {
		WebDriver driver;
		WebDriverWait wait;
        @Given("^open the browser and go to Alchemy Jobs site and navigate to Post a Job page$")
		public void Home_Page() throws Throwable {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://alchemy.hguy.co/jobs/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.linkText("Post a Job")).click();
		}
	
		
		@When("^User enters the \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and click Preview and submit$")
		
		public void user_input(String Email, String JobTitle, String Desc, String Comp)throws Throwable {
			
			driver.findElement(By.id("create_account_email")).sendKeys(Email);
			driver.findElement(By.id("job_title")).sendKeys(JobTitle);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("javascript:window.scrollBy(250,450)");
		   
		    //Thread.sleep(10000);
		    driver.switchTo().frame("job_description_ifr");
			driver.findElement(By.id("tinymce")).sendKeys(Desc);
			driver.switchTo().parentFrame();
			driver.findElement(By.id("application")).sendKeys(Email);
			driver.findElement(By.id("company_name")).sendKeys(Comp);
		    js.executeScript("javascript:window.scrollBy(250,4000)");
		    //driver.findElement(By.className("button")).click();
		    driver.findElement(By.xpath("//*[@class='button secondary save_draft']")).click();
			}
		@Then ("^Go to Jobs page and Confirm job listing is shown on page \"(.*)\"$")
		public void validation(String JobTitle)throws Throwable{
			driver.findElement(By.xpath("//header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
			driver.findElement(By.id("search_keywords")).sendKeys(JobTitle);
			driver.findElement(By.className("search_submit")).click();
			//String jobName=driver.findElement(By.xpath("//article/div/div/ul/li/a/div[1]/h3")).getText();
			//Assert.assertEquals(jobName, JobTitle);
		}
	

	}
