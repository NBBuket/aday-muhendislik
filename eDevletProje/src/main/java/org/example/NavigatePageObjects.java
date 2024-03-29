package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigatePageObjects extends AbstractClass {

    WebDriver driver;

    public NavigatePageObjects() { //Driver ile açılan sayfadaki elementleri bulmamıza yardımcı olan constructor

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/div/section/aside/ul/li[1]") //sol yanda yer alan bilgilendirme mesaj
    private WebElement controlMessage;
    public void infoBoxCheck() {

        System.out.println("Message: " + controlMessage.getText());
    }

    @FindBy(className = "comboBox") //classı comboBox olan ilk web elementi
    private WebElement comboBox;

    public void clickOnComboBox(String comboBoxElement) {

        selectElementFromDropdown(comboBox, comboBoxElement);
    }
}
