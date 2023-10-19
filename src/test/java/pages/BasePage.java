package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static configuration.DriverFactory.appiumDriver;
import static configuration.DriverFactory.getDriver;
public class BasePage {

    static WebDriverWait wait = new WebDriverWait(appiumDriver, 6000);

    public static void visibilityOf(MobileElement el) {
        wait.until(
                webDriver -> ExpectedConditions.visibilityOf(el).apply(webDriver)
        );

    }
    public static void toBeClickable(MobileElement el) {
        wait.until(ExpectedConditions.elementToBeClickable(el));
    }

    public static void click(MobileElement el) {
        toBeClickable(el);
        el.click();
    }

    public static String getText(MobileElement el) {
        visibilityOf(el);
        return el.getText();
    }

    public static void sendKeys(MobileElement el, String text) {
        visibilityOf(el);
        el.sendKeys(text);
    }
    public void fecharTeclado(){
        appiumDriver.hideKeyboard();
    }

}
