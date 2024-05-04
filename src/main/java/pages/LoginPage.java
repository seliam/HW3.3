package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Locators.*;

public class LoginPage extends BasePage{
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setEmail2(String email2){
        driver.findElement(email2Field).sendKeys(email2);
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
    public SecureAreaPage createAcountButton(){
        driver.findElement(createButton).click();
        return new SecureAreaPage(driver);
    }
    public SecureAreaPage forgotPassword(){
        driver.findElement(forgotButton).click();
        return new SecureAreaPage(driver);
    }
}
