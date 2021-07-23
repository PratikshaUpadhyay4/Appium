package pac.practice;

		import java.net.MalformedURLException;
		import java.net.URL;
		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.remote.DesiredCapabilities;

		import io.appium.java_client.android.AndroidDriver;

		public class apimultidemo {
			public static void main(String[] args) throws MalformedURLException {
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
				  
				  List<WebElement>options=driver.findElementsByClassName("android.widget.TextView");
				  
				  for(int i=1;i<options.size();i++) {
					  System.out.println(options.get(i).getText());
				  }
			}
		}


