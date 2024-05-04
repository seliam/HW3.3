package constants;

import org.openqa.selenium.By;

public class Locators {
    public static final By button = By.xpath("//*[@id=\"html-body\"]/div[3]/header/div/div[2]/ul/li[1]/a");
    public static final By emailField = By.id("email");
    public static final By passwordField = By.id("pass");
    public static final By loginButton = By.id("send2");
    public static final By createButton = By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[3]/div[2]/div[2]/div/div/a");
    public static final By forgotButton = By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a/span");
    public static final By email2Field = By.id("email_address");
    public static final By statusAlert = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div[1]/div/div");
    public static final By base = By.className("base");
    public static final By resetButton = By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");
}
