package Appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class Appium03 {

    private AndroidDriver driver;

    @Test
    public void test01() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("appium:automationName", "uiautomator2");
        capabilities.setCapability("appium:newCommandTimeout", 3600);
        capabilities.setCapability("appium:platformVersion", "10.0");
        capabilities.setCapability("appium:ensureWebviewsHavePages", true);
        capabilities.setCapability("appium:nativeWebScreenshot", true);
        capabilities.setCapability("appium:connectHardwareKeyboard", true);
        capabilities.setCapability("appPackage", "com.davemac327.gesture.tool");
        capabilities.setCapability("appActivity", "com.davemac327.gesture.tool.GestureBuilderActivity");
        capabilities.setCapability("noReset", true);


        URL remoteUrl = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(remoteUrl, capabilities);

        if (driver.isDeviceLocked()) {
            driver.unlockDevice();
        }
        System.out.println("app yuklendi");

        Thread.sleep(5000);
        driver.findElement(AppiumBy.id("android:id/title")).isDisplayed(); //homeScreenTitle
        System.out.println("ana sayfa acildi");

        Thread.sleep(5000);
        driver.findElement(AppiumBy.id("com.davemac327.gesture.tool:id/testButton")).click();
        System.out.println("test button calisiyor");

        Thread.sleep(5000);
        driver.findElement(AppiumBy.id("android:id/title")).isDisplayed();
        System.out.println("test screen acildi");

        driver.quit();
    }
}
