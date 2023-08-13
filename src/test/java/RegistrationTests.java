import config.AppiumConfig;
import dto.UserDTO;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.RandomUtils;

public class RegistrationTests extends BaseTest {

        LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage = new RegistrationPage();
    SearchPage searchPage = new SearchPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    SplashPage splashPage = new SplashPage();

    @Test
    public void registrationPositiveTest() {
        RandomUtils randomUtils = new RandomUtils();
        String email = randomUtils.generateRandomEmail();
        System.out.println("email: ----------------- " + email);
        UserDTO userDto = UserDTO.builder()
                .name("autotest")
                .lastName("nfdgkini")
                .email(email)
                .password("123456Aa$")
                .build();
        searchPage.switchToRegistrationPage();
        registrationPage.fillRegistrationForm(userDto);
        Assert.assertTrue(searchPage.validatePageTitleCorrect());
    }

}
