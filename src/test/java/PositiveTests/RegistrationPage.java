package PositiveTests;

//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.WatchEvent;

//@Epic("Фонбет тетсирование селениум")
//@Feature("форма регистрации")
//@Owner("Сергей")

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;
//    Локаторы на странице регистрации пользователя
    By numberPhoneFieldLocator = By.xpath("//input[@type='tel']");
    By passwordField = By.xpath("//input[@name='password']");
    By buttonRegistration = By.xpath("//span[@class='button--_ckCX _accent--di6kg _sizeL--cOYoD _hasText--a86Tm _interactive--hyuU0']");
    By checkBoxOffers = By.xpath("//div[@class='check--Mp6Y0']");
    By hrefMoreDetailed = By.xpath("//div[@class='origin-checkbox-button--EhZRt origin-checkbox-button-default--odcW9']");
    By checkBoxAge = By.xpath("//svg[@fill='none']");
    RegistrationPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

//    @Step("Вводим номер телефона в поле")
    public void setNumberPhoneFieldLocator(String numberPhoneLocator){
        wait.
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='tel']")));
        WebElement element = driver.findElement(numberPhoneFieldLocator);

        element
                .sendKeys(numberPhoneLocator);
    }
//    @Step("Вводим пароль")
    public void setPassword(String password){
        wait.
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
        WebElement element = driver.findElement(passwordField);
        element
                .sendKeys(password);
    }


//    @Step("Нажимаем на кномку 'Регистрация'")
    public void setButtonRegistration(){
        WebElement element = driver.findElement(buttonRegistration);
        element
                .click();
    }
    public void setCheckBoxOffers(){
        WebElement element = driver.findElement(checkBoxOffers);
        if (!element.isSelected()){
            element
                    .click();
        }
    }
    public void setHrefMoreDetailed(){
        WebElement element = driver.findElement(hrefMoreDetailed);
        element
                .click();
    }
    public void setCheckBoxAge(){
        WebElement element = driver.findElement(checkBoxAge);
            element
                    .click();


    }
}
