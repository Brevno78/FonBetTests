package PositiveTests;

//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import pages.BasePage;
import pages.RegistrationPage;

public class AllTestRunner extends BasePage {
    RegistrationPage registrationPage;
    @BeforeEach
    public void setUp(){
        registrationPage = new RegistrationPage(driver, wait);
    }
    @DisplayName("Запуск позитивного теста на форму регистрации")
    @Description("Пользователь регистрируется в системе")
//    @Story("Create user")
//    @Severity(SeverityLevel.NORMAL)
    @Test
    public void testRegistrationPage(){
        driver
                .get("https://fon.bet/authProcess/registration");

        driver
                .manage()
                .window()
                .maximize();
        registrationPage.setNumberPhoneFieldLocator("9315433427");
        registrationPage.setPassword("afdgfd23r4*");
        registrationPage.setCheckBoxOffers();
        registrationPage.setHrefMoreDetailed();
        registrationPage.setCheckBoxAge();
        registrationPage.setButtonRegistration();
    }
}
