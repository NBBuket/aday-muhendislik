package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public abstract class AbstractClass {

    //açılacak sekmeyi oluşturan driver objesi
    private final WebDriver driver = Driver.getDriver();

    //yüklenmelerdeki beklemeyi gerçekleştiren wait objesi
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10L));

    //bilgilendirme mesajını oluşturan obje
    InfoLog infoMessage = new InfoLog();


    //tıklama fonksiyonu
    public void clickFunction(WebElement clickElement) {

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    //yazdırma fonksiyonu
    public void sendKeysFunctions(WebElement sendKeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    //doğrulamayı yapan fonksiyon
    public void assertion(WebElement actual, String expected) {

        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        infoMessage.sampleLog(actual.getText());
    }

    //dropdown elementinden seçim yapan fonksiyon
    public void selectElementFromDropdown(WebElement dropdown, String element){

        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }

    //string & string doğrulaması yapan fonksiyon
    public void assertionString(String actual, String expected) {

        Assert.assertEquals(actual, expected);
        infoMessage.sampleLog(actual);
    }
}
