package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("nitish");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("nitish");
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
        driver.close();
	}

}
