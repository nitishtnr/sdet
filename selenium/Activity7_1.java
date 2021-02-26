package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class, 'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		System.out.println(driver.findElement(By.id("action-confirmation")).getText());

	}

}
