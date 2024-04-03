package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Objects;

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

    @FindBy(className = "comboBox") //class'ı comboBox olan elementler
    private List<WebElement> idNames;
    public List<WebElement> getIdNames() { //elementlere ulaşmamızı sağlayan get fonksiyonu

        return idNames;
    }
    public void clickOnComboBox(String comboBoxId, String givenIlce) {

        for (WebElement element : getIdNames()) { //elementleri tek tek gezerek verilen id'yi arayan for döngüsü

            if(Objects.equals(element.getAttribute("id"), comboBoxId)) { //id eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu

                selectElementFromDropdown(element, givenIlce);
            }
        }
    }
}
