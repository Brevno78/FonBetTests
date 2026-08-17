package SepTests;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Password {
    WebDriver webDriver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    By passwordField = By.xpath("//input[@name='password']");

    @Test
    public void PositivePasswordTest(){
        webDriver
                .manage()
                .window()
                .maximize();
        webDriver
                .get("https://fon.bet/authProcess/registration");
        wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='tel']")));

        WebElement password = webDriver.findElement(passwordField);
        password
                .sendKeys("aborigen2441!");
    }
}
