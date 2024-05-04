
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;
import static constants.AssertionMessages.*;
import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest extends BaseTest{
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.navigateToLogin();
        loginPage.setEmail("selia_mardirosi@edu.aua.am");
        loginPage.setPassword("SuperSecretpass$");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains(message));
    }
    @Test
    public void createAcoount(){
        LoginPage loginPage = homePage.navigateToLogin();
        SecureAreaPage secureAreaPage = loginPage.createAcountButton();
        assertTrue(message1,secureAreaPage.isBaseElementVisible());
    }
    @Test
    public void forgotPassword(){
        LoginPage loginPage = homePage.navigateToLogin();
        SecureAreaPage secureAreaPage = loginPage.forgotPassword();
        loginPage.setEmail2("selia_mardirosi@edu.aua.am");
        assertTrue(message2,secureAreaPage.isResetButtonVisible());
    }
    @Test
    public void wrongtest1(){
        LoginPage loginPage = homePage.navigateToLogin();
        loginPage.setEmail("selia_mardirosi@edu.aua.am");
        loginPage.setPassword("SuperSecretpass");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String restrictedUrl = "https://www.krcs.co.uk/customer/account/";
        assertNotEquals("The user navigated to the restricted URL with incorrect credentials.", restrictedUrl, driver.getCurrentUrl());
    }
    @Test
    public void wrongTest2(){
        LoginPage loginPage = homePage.navigateToLogin();
        loginPage.setEmail("seliamardirosi@gmail.com");
        loginPage.setPassword("SuperSecretpass$");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String restrictedUrl = "https://www.krcs.co.uk/customer/account/";
        assertNotEquals("The user navigated to the restricted URL with incorrect credentials.", restrictedUrl, driver.getCurrentUrl());
    }
}
