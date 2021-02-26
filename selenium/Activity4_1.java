package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		System.out.println(driver.getTitle());
		
	}

}
