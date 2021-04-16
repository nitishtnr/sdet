package Activities;

	
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileBy;
	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;

	public class Proj1Activity1 {
	    AppiumDriver<MobileElement> driver = null;
	    WebDriverWait wait;
	    
		@BeforeClass
		public void opentask() throws MalformedURLException {
			DesiredCapabilities caps = new DesiredCapabilities();
		    caps.setCapability("deviceId", "emulator-5554");	
		    caps.setCapability("deviceName", "Pixel4emulator");
		    caps.setCapability("platformName", "android");
		    caps.setCapability("appPackage", "com.google.android.keep");
		    caps.setCapability("appActivity", ".activities.BrowseActivity");
		    caps.setCapability("noReset", true);
		    
		    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		    wait = new WebDriverWait(driver, 10);

		}
	    
	  
	    
	    public void addnote(String task, boolean reqremainder) {

	    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("New text note")));
	    	MobileElement addnote = driver.findElementByAccessibilityId("New text note");
	    	addnote.click();
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/editable_title")));
	    	MobileElement title = driver.findElementById("com.google.android.keep:id/editable_title");
	    	title.sendKeys(task);
	    	
	    	String notes = "Complete the task: " + task;
	    	String noteasrt= task+". "+notes+". ";
	    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/edit_note_text")));
	    	MobileElement note = driver.findElementById("com.google.android.keep:id/edit_note_text");
	    	note.sendKeys(notes);
	    	
	    	boolean remainderasrt = false;
	    	if (reqremainder == true) {
	    		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("com.google.android.keep:id/menu_reminder")));
	        	MobileElement remainder = driver.findElementById("com.google.android.keep:id/menu_reminder");
	        	remainder.click();
	        	
	        	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("text(\"Tomorrow morning\")")));
	        	MobileElement tomorrow = driver.findElement(MobileBy.AndroidUIAutomator("text(\"Tomorrow morning\")"));
	        	tomorrow.click();
	        	
	        	remainderasrt = true;
	    	}
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Navigate up")));
	    	MobileElement back = driver.findElementByAccessibilityId("Navigate up");
	    	back.click();
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(noteasrt)));
	    	MobileElement asrttitle = driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\""+noteasrt+"\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	    	MobileElement asrtnote = driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\""+noteasrt+"\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]");
	    	
	    	if (remainderasrt == true) {
	        	MobileElement asrtremainder = driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\""+noteasrt+"\"]//android.widget.LinearLayout/android.widget.TextView");
	        	System.out.println("Rmainder Option selected is: " + asrtremainder.getText());
	    	}
	    	
	    	Assert.assertEquals(task, asrttitle.getText());
	    	Assert.assertEquals(notes, asrtnote.getText());
	    		  
	    }
	    
	    @Test
	    public void definetask() {
	    	String notes[] = {"Mynote 1","Mynote 2"};
	    	boolean remainderreq = false;
	    	//String notes[] = {JOptionPane.showInputDialog("Enter the Notes name")};
	    	int notelen = notes.length;
	    	
	    	for (String notelist : notes) {
	    		if ((notes[notelen - 1])== notelist) {
	    			remainderreq = true;
	    		}
	    		addnote(notelist, remainderreq);
	    	}
	    }
	    
	    @AfterClass
	    public void closetask() {
	    	driver.quit();
	    }
	}