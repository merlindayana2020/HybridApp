package hybrid;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Cap {

		public static AndroidDriver<AndroidElement> capabilites() throws MalformedURLException {
			//this line is getting the path of the application
			//File fp = new File("src\\General-Store.apk");
			DesiredCapabilities cap = new DesiredCapabilities();
			//cap.setCapability(MobileCapabilityType.APP, fp.getAbsolutePath());
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Merlin1 Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");		
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2); //not nesssary by default this value will be taken
			cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"C:\\Users\\MerlinR\\Desktop\\Full Stack Tester\\Appium\\chromedriver.exe");
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			return driver;
		}
}
