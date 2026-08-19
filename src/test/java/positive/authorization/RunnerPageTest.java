package positive.authorization;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.AuthorizationPage;
import pages.BasePage;

public class RunnerPageTest extends BasePage {
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
    @AfterEach
    public void exitAccount(){
     authorizationPage
             .setButtonMyProfile();
     authorizationPage
             .setButtonExit();
     driver
             .close();
    }
}
