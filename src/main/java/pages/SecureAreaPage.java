package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static constants.Locators.*;
public class SecureAreaPage extends BasePage{
    private WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }

    public boolean isBaseElementVisible() {
        return driver.findElements(base).size() > 0 && driver.findElement(base).isDisplayed();
    }

    public boolean isResetButtonVisible(){
        return driver.findElements(resetButton).size() > 0 && driver.findElement(resetButton).isDisplayed();
    }

}
