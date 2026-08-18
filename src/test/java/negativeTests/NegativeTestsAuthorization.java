package negativeTests;

import pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NegativeTestsAuthorization extends BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public NegativeTestsAuthorization(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
}
