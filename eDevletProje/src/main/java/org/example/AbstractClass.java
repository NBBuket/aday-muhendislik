package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public abstract class AbstractClass {

    private final WebDriver driver = Driver.getDriver(); //chrome sekmemizi oluşturan obje
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));

    //Sayfa objelerinde genel kullanılan tıklama fonksiyonu
    public void clickFunction(WebElement clickElement) {

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    //Sayfa objelerinde genel kullanılan yazdırma fonksiyonu
    public void sendKeysFunctions(WebElement sendKeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    //Then adımında yer alan doğrulamayı yapan fonksiyon
    public void assertion(WebElement actual, String expected) {

        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        System.out.println("Message: " + actual.getText());
    }
}
