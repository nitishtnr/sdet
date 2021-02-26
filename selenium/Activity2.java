package Session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String Title = driver.getTitle();
		System.out.println(Title);
		WebElement id = driver.findElement(By.id("about-link"));
		System.out.println(id.getText());
		WebElement className = driver.findElement(By.className("green"));
		System.out.println(className.getText());
		WebElement css = driver.findElement(By.cssSelector(".green"));
        System.out.println(css.getText());	
        WebElement linkText = driver.findElement(By.linkText("About Us"));
        System.out.println(linkText.getText());
        driver.close();


	}

}
