import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTest {

        LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    SearchPage searchPage = new SearchPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    SplashPage splashPage = new SplashPage();

    String city = "Tel Aviv";
    int dayFrom = 4;
    int dayTo = 10;
    int quantityNextMonth = 1;

    @Test
    public void testFillSearchForm() {
        searchPage.fillSearchForm(city, quantityNextMonth, dayFrom, dayTo);
        Assert.assertTrue(searchResultPage.validateTitleDisplaysCorrect());
    }

}
