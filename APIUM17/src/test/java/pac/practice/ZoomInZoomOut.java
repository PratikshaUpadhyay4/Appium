package pac.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ZoomInZoomOut {
	
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, Throwable {
	
	DesiredCapabilities dc = new DesiredCapabilities();
	// Common DC (Android or IOS)
	dc.setCapability("deviceName", "Redmi");		
	dc.setCapability("automationName", "appium");
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "8.1.0");
	dc.setCapability("UDID", "c7b541f70705");
	dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
	dc.setCapability("appActivity",".MainActivity");

	URL url = new URL("http://localhost:4723/wd/hub");

	driver = new AndroidDriver(url, dc);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
	
	WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
	
	driver.zoom(img);
	
	Thread.sleep(3000);
	
	driver.pinch(img);

}
}
