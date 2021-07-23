package pac.practice;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class apidemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		// Common DC (Android or IOS)
		dc.setCapability("deviceName", "Redmi");		
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "8.1.0");
		dc.setCapability("UDID", "c7b541f70705");
		//DC for Android 
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		// Appium Server Port No.
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Views").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Controls").click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("pratiksha");
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Checkbox 2").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("RadioButton 2").click();
	}

	}

