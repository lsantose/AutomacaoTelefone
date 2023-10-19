package configuration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class DriverFactory {
    public static AppiumDriver<MobileElement> appiumDriver;

    public static AppiumDriver<MobileElement> createDriverByParameter(String plataformName) throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (plataformName.equals("Android")){
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "RX8N304QYZE");
            capabilities.setCapability("appPackage", "com.samsung.android.dialer");
            capabilities.setCapability("appActivity", "com.samsung.android.dialer.DialtactsActivity");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("chromedriverExecutable", "C:/webdrivers/chromedriver.exe");
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability("autoAcceptAlerts", true);
            appiumDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/"), capabilities);
        } else {
            Logger.getGlobal().info("Insira uma plataforma válida");
        }
        return appiumDriver;
    }

    public static  AppiumDriver<?> getDriver(){
        return appiumDriver;
    }

    public static void quitDriver(){
        if (appiumDriver != null)
            appiumDriver.quit();
    }
}
