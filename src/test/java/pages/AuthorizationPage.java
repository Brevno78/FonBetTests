package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorizationPage {
    WebDriver driver;
    WebDriverWait wait;
//    пароль для фонбета - gki,W%/#%6rmMfA

    By numberPhoneLocator = By.xpath("//input[@name='login']");
    By passwordLocator = By.xpath("//input[@type='password']");
    By buttonEntrance = By.xpath("//span[@class='button--_ckCX _accent--di6kg _sizeL--cOYoD _hasText--a86Tm _interactive--hyuU0']");
    By buttonMyProfile = By.xpath("//a[@class='button--_ckCX _hasText--a86Tm _interactive--hyuU0 header--account-button-main--Xj5WK']");
    By buttonExit = By.xpath("//span[@class='button--_ckCX _secondaryColor--Pt8HI _sizeM--QC_LH _hasText--a86Tm _interactive--hyuU0 exit--iLAp7']");

    public AuthorizationPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void setNumberPhoneLocator(String numberPhone){
        wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='login']")));
        WebElement element = driver.findElement(numberPhoneLocator);
        element
                .sendKeys(numberPhone);
    }
    public void setPasswordLocator(String password){
        wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
        WebElement element = driver.findElement(passwordLocator);
        element
                .sendKeys("gki,W%/#%6rmMfA");
    }
    public void setButtonEntrance(){
        wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button--_ckCX _accent--di6kg _sizeL--cOYoD _hasText--a86Tm _interactive--hyuU0']")));
        WebElement element = driver.findElement(buttonEntrance);
        element
                .click();
    }
    public void setButtonMyProfile(){
        wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button--_ckCX _hasText--a86Tm _interactive--hyuU0 header--account-button-main--Xj5WK']")));
        WebElement element = driver.findElement(buttonMyProfile);
        element
                .click();
    }
    public void setButtonExit(){
        wait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button--_ckCX _secondaryColor--Pt8HI _sizeM--QC_LH _hasText--a86Tm _interactive--hyuU0 exit--iLAp7']")));
        WebElement element = driver.findElement(buttonExit);
        element
                .click();
    }
}
