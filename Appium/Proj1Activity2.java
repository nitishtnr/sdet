package Activities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Proj1Activity2 {
	AppiumDriver<MobileElement> driver = null;

	@BeforeClass
	public void begining() throws InterruptedException, IOException {
		DesiredCapabilities pixelCapability = new DesiredCapabilities();
		pixelCapability.setCapability("deviceId", "emulator-5554");
		pixelCapability.setCapability("deviceName", "Pixel4emulator");
		pixelCapability.setCapability("platformName", "Android");
		pixelCapability.setCapability("appPackage", "com.google.android.keep");
		pixelCapability.setCapability("appActivity", ".activities.BrowseActivity");
		pixelCapability.setCapability("noReset", true);
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), pixelCapability);
	}

	@Test (priority=1)
	public void Add_Tasks() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("new_note_button").click();
		driver.findElementById("editable_title").sendKeys("Appium");
		driver.findElementById("edit_note_text").sendKeys("Note for Appium Project");
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
	}

	@Test (priority=2)
	public void Assertions () {
		String title = driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\"Appium. Note for Appium Project. \"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]").getText();
		String content = driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\"Appium. Note for Appium Project. \"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]").getText();
		Assert.assertEquals(title, "Appium");
		Assert.assertEquals(content, "Note for Appium Project");
	}

	@AfterClass
	public void closing() {
		driver.quit();
	}
}