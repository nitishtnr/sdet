package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		String Title = driver.getTitle();
		System.out.println(Title);
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.isDisplayed());
		driver.findElement(By.id("toggleCheckbox")).click();
		System.out.println(checkbox.isDisplayed());
		driver.close();

	}

}
