package SepTests;

//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PhoneNumber {
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

//        Локатор для поля номера телефона
        By numberPhoneField = By.xpath("//input[@type='tel']");
@Test
    public void numberTest(){

        driver
                .manage()
                .window()
                .maximize();
        driver
                .get("https://fon.bet/authProcess/registration");
        wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='tel']")));

        WebElement numberPhone = driver.findElement(numberPhoneField);
        numberPhone
                .sendKeys("9315433427");
    }
}
