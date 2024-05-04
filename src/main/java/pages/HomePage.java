package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Locators.button;

public class HomePage extends BasePage{
    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public LoginPage navigateToLogin(){
        WebDriverWait webDriverWait= new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(button))).click();
        return new LoginPage(driver);
    }
}
