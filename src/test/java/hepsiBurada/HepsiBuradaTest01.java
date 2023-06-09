package hepsiBurada;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class HepsiBuradaTest01 {

    private AndroidDriver driver;

    @Test
    public void test01() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:udid", "emulator-5554");
        desiredCapabilities.setCapability("appium:appActivity", "com.hepsiburada.ui.home.BottomNavigationActivity");
        desiredCapabilities.setCapability("appium:platformVersion", "10.0");
        desiredCapabilities.setCapability("appium:noReset", true);
        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
        desiredCapabilities.setCapability("appium:appPackage", "com.pozitron.hepsiburada");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("(//*[@class='android.view.View'])[6]")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.id("com.pozitron.hepsiburada:id/etSearchBox")).click();
        driver.findElement(AppiumBy.id("com.pozitron.hepsiburada:id/etSearchBox")).sendKeys("Cicek");
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='çiçek']")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[5]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sepete ekle']")).click();

        driver.quit();
    }
}
