package positive.authorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseAuthorizationPage {
    WebDriver driver;
    WebDriverWait wait;

    public BaseAuthorizationPage(){
        this.driver = new ChromeDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
}

