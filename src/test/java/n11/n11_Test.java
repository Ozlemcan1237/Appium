package n11;

import Appium.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class n11_Test extends BaseClass {
    private AndroidDriver driver;

    @Test
    public void test01() throws MalformedURLException, InterruptedException {
         driver = getAndroidDriver();

        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("(//*[@class='android.view.View'])[7]")).click();
        Thread.sleep(7000);
        driver.findElement(AppiumBy.id("com.dmall.mfandroid:id/tvHomeSearchBar")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.id("com.dmall.mfandroid:id/etSearch")).sendKeys("Çanta", Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='Ayakkabı & Çanta'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Kadın Ayakkabı']")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Kadın Günlük Ayakkabı']")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[9]")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Pudra']")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='39']")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Sepete Ekle']")).click();
        Thread.sleep(5000);
        driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[21]")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(AppiumBy.id("com.dmall.mfandroid:id/tvBasketTitle")).isDisplayed());

        driver.quit();
    }
}

//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("appium:udid", "emulator-5554");
//        desiredCapabilities.setCapability("appium:appActivity", "com.dmall.mfandroid.activity.base.NewSplash");
//        desiredCapabilities.setCapability("appium:platformVersion", "10.0");
//        desiredCapabilities.setCapability("appium:noReset", true);
//        desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
//        desiredCapabilities.setCapability("appium:appPackage", "com.dmall.mfandroid");
//        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
//        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
//        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
//        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
//
//
//        URL remoteUrl = new URL("http://127.0.0.1:4723");
//        driver = new AndroidDriver(remoteUrl, desiredCapabilities);