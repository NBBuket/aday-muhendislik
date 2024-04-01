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

    @FindBy(name = "basvuruTipi") //classı comboBox olan başvuru dropdown elementi
    private WebElement comboBox;
    public void clickOnBasvuruComboBox(String comboBoxElement) {

        selectElementFromDropdown(comboBox, comboBoxElement);
    }

    @FindBy(name = "ilceKodu") ////classı comboBox olan ilçe dropdown elementi
    private WebElement ilceComboBox;
    public void clickOnIlceComboBox(String ilce) {

        selectElementFromDropdown(ilceComboBox, ilce);
    }

    @FindBy(name = "mahalleKodu") ////classı comboBox olan mahalle dropdown elementi
    private WebElement mahalleComboBox;
    public void clickOnMahalleComboBox(String mahalle) {

        selectElementFromDropdown(mahalleComboBox, mahalle);
    }

    @FindBy(name = "caddeSokakKodu") ////classı comboBox olan cadde/sokak dropdown elementi
    private WebElement caddeSokakComboBox;
    public void clickOnCaddeSokakComboBox(String caddeSokak) {

        selectElementFromDropdown(caddeSokakComboBox, caddeSokak);
    }
}
