import config.AppiumConfig;
import org.testng.annotations.BeforeSuite;
import pages.*;

public class BaseTest extends AppiumConfig {
//    LoginPage loginPage = new LoginPage();
//    RegistrationPage registrationPage = new RegistrationPage();
//    SearchPage searchPage = new SearchPage();
//    SearchResultPage searchResultPage = new SearchResultPage();
//    SplashPage splashPage = new SplashPage();

    @BeforeSuite
    public void start() {
        //getDriver();
    }

}
