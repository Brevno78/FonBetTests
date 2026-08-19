package negativeTests;

import pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;

public class NegativeTestsAuthorization extends BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public NegativeTestsAuthorization(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void MyTest(){
        System.out.println("Hello World");
    }
}
