package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {


				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.training-support.net/selenium/simple-form");
				String Title = driver.getTitle();
				System.out.println(Title);
				
				WebElement firstname = driver.findElement(By.id("firstName"));
				firstname.sendKeys("Nitish");
				WebElement lastname = driver.findElement(By.id("lastName"));
				lastname.sendKeys("Raghava");
				driver.findElement(By.id("email")).sendKeys("nitish.email.com");
				driver.findElement(By.id("number")).sendKeys("8268264");
				driver.findElement(By.cssSelector(".ui.green.button")).click();
		        driver.close();


			}


	}

