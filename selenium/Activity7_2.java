package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-attributes");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("NewUser");
		driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("Password");
		driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("Password");
		driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("real_email@xyz.com");
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

        System.out.println(driver.findElement(By.id("action-confirmation")).getText());
        driver.close();

	}

}
