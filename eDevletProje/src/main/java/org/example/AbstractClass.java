package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
    public boolean sendKeysFunctions(WebElement sendKeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
        return true;
    }

    //Then adımında yer alan doğrulamayı yapan fonksiyon
    public void assertion(WebElement actual, String expected) {

        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        InfoLog infoMessage = new InfoLog();
        infoMessage.sampleLog(actual.getText());
    }

    //ComboBox classındaki dropdown elemanlarından seçilecek olanı seçen fonksiyon
    public void selectElementFromDropdown(WebElement dropdown, String element){

        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }

    //İki parametrenin de string olduğu zaman doğrulamayı yapan fonksiyon
    public void assertionString(String actual, String expected) {

        Assert.assertEquals(actual, expected);
        InfoLog infoMessage = new InfoLog();
        infoMessage.sampleLog(actual);
    }
}
