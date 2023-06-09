package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium01 {
    private AndroidDriver driver;
    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:udid", "emulator-5554");
        desiredCapabilities.setCapability("appium:appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        desiredCapabilities.setCapability("appium:platformVersion", "10.0");
        desiredCapabilities.setCapability("appium:noReset", true);
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
        desiredCapabilities.setCapability("appium:appPackage", "com.davemac327.gesture.tool");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

        driver.quit();
    }
}


//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60000");
//
//        capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\sueda\\IdeaProjects\\Appium\\src\\Apps\\Gesture Tool_1.3_Apkpure.apk");
//        capabilities.setCapability("appPackage", "com.davemac327.gesture.tool");
//        capabilities.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
//        capabilities.setCapability("noReset", true);
//
//        //capabilities.setCapability("autoGrantPermissions", true);
//
//
//        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//
//        driver.closeApp();