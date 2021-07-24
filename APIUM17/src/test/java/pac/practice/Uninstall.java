package pac.practice;

	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.android.AndroidDriver;
	

	public class Uninstall {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			
			DesiredCapabilities dc = new DesiredCapabilities();
			// Common DC (Android or IOS)
			dc.setCapability("deviceName", "Redmi");		
			dc.setCapability("automationName", "appium");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "8.1.0");
			dc.setCapability("UDID", "c7b541f70705");

			dc.setCapability("appPackage", "com.androidsample.generalstore");
			dc.setCapability("appActivity", ".SplashActivity");
			
	         URL url=new URL("http://localhost:4723/wd/hub");
			
			AndroidDriver driver=new AndroidDriver(url,dc);
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
		System.out.println("App status="+driver.isAppInstalled("com.androidsample.generalstore"));
		
		driver.removeApp("com.androidsample.generalstore");
		
		System.out.println("App status="+driver.isAppInstalled("com.androidsample.generalstore"));
		
	}
	

}



