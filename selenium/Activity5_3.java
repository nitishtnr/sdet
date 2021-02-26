package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		String Title = driver.getTitle();
		System.out.println(Title);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(checkbox.isEnabled());
		driver.findElement(By.id("toggleInput")).click();
		System.out.println(checkbox.isEnabled());
		driver.close();

	}

}
