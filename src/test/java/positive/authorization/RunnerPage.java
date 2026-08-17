package positive.authorization;

import PositiveTests.BasePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Driver;

public class RunnerPage extends BaseAuthorizationPage {
    AuthorizationPage authorizationPage;
    @BeforeEach
    public void setUp()
    {authorizationPage = new AuthorizationPage(driver, wait);}
    @Test
    public void testAuthorization(){
        driver
                .get("https://fon.bet/authProcess/login");
        driver
                .manage()
                .window()
                .maximize();

        authorizationPage
                .setNumberPhoneLocator("89315433427");
        authorizationPage
                .setPasswordLocator("gki,W%/#%6rmMfA");
        authorizationPage
                .setButtonEntrance();
    }
}
