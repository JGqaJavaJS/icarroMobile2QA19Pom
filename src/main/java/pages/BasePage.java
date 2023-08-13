package pages;

import config.AppiumConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    AppiumConfig appiumConfig = new AppiumConfig();

    AppiumDriver driver;

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getText(MobileElement element) {
        driver = appiumConfig.getDriver();
        return element.getText().trim().toUpperCase();
    }

    public void typeText(String text, MobileElement element) {
        driver = appiumConfig.getDriver();
        element.click();
        element.clear();
        element.sendKeys(text);
        driver.hideKeyboard();
    }

    public void click(MobileElement element) {
        driver = appiumConfig.getDriver();
        element.click();
    }

    public void wait(MobileElement element) {
        driver = appiumConfig.getDriver();
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(element));
    }

}
