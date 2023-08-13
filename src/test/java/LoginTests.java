import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class LoginTests extends BaseTest {

        LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    SearchPage searchPage = new SearchPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    SplashPage splashPage = new SplashPage();

    @Test
    public void loginTestPositive() {
        String email = "john215autotest@hotmail.com";
        String password = "123456Aa$";
        searchPage.switchToLoginPage();
        loginPage.fillLoginForm(email, password);
        Assert.assertTrue(searchPage.validatePageTitleCorrect());
    }

}
