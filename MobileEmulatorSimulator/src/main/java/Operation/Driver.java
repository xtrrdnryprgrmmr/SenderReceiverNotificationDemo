package Operation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static AppiumDriver driver;

    public static AppiumDriver setDriver(String testPlatform, String deviceName, String emulator) throws MalformedURLException {

        switch (testPlatform) {
            case "Android": {
                DesiredCapabilities androidCaps = new DesiredCapabilities();
                androidCaps.setCapability("appium:deviceName", deviceName);
                androidCaps.setCapability("appium:automationName", Constants.automationFramework);
                androidCaps.setCapability("appium:udid", emulator);
                androidCaps.setCapability("appium:platformName", Constants.operatingSystem);
                androidCaps.setCapability("appium:platformVersion", "11.0");
                androidCaps.setCapability("appium:skipUnlock", "true");
                androidCaps.setCapability("appium:appPackage", "com.google.android.gm");
                androidCaps.setCapability("appium:appActivity","com.google.android.gm.ui.MailActivityGmail" );
                androidCaps.setCapability("appium:noReset", "true");
                androidCaps.setCapability("unicodeKeyboard", "true");
                androidCaps.setCapability("resetKeyboard", "true");
                driver = new AndroidDriver(new URL(Constants.serverPath), androidCaps);
                break;
            }
            default: {
                System.out.println("iOS Test");
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
