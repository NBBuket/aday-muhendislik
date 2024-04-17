package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
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
    private List<WebElement> comboBoxIdNames;
    public List<WebElement> getComboBoxIdNames() { //elementlere ulaşmamızı sağlayan get fonksiyonu

        return comboBoxIdNames;
    }
    public void clickOnComboBox(String comboBoxId, String givenValue) {

        for (WebElement element : getComboBoxIdNames()) { //elementleri tek tek gezerek verilen id'yi arayan for döngüsü

            if(Objects.equals(element.getAttribute("id"), comboBoxId)) { //id eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu

                selectElementFromDropdown(element, givenValue);
                if(element.isDisplayed()) {

                    System.out.println("Verification succeed");
                } else {

                    System.out.println("Verification failed");
                }
            }
        }
    }

    @FindBy(className = "checkBox")
    private List <WebElement> checkBoxElement;
    public List<WebElement> getCheckBoxElement() { //elementlere ulaşmamızı sağlayan get fonksiyonu

        return checkBoxElement;
    }
    public void clickOnCheckBox(String checkBoxId){

        for (WebElement element: getCheckBoxElement()) { //elementleri tek tek gezerek verilen id'yi arayan for döngüsü

            if(Objects.equals(element.getAttribute("id"), checkBoxId)) { //id eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu

                Actions actions = new Actions(driver);
                actions.scrollToElement(element); //element sayfada ilk başta görünmüyorsa elementin olduğu kısıma ilerletir
                actions.perform();
                element.click();
                if(element.isSelected()) {

                    System.out.println("Verification succeed");
                } else {

                    System.out.println("Verification failed");
                }
            }
        }
    }

   @FindAll({
           @FindBy(className = "text"),
           @FindBy(className = "textarea")})
    private List <WebElement> textElement;
    public List<WebElement> getTextElement() { //elementlere ulaşmamızı sağlayan get fonksiyonu

        return textElement;
    }
    public void clickOnTextBoxAndWrite(String textBox, String text) {

        for (WebElement element: getTextElement()) {

            if(Objects.equals(element.getAttribute("id"), textBox)) { //id eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu

                Actions actions = new Actions(driver);
                actions.scrollToElement(element); //element sayfada ilk başta görünmüyorsa elementin olduğu kısıma ilerletir
                actions.perform();
                clickFunction(element);
                element.clear();
                sendKeysFunctions(element, text);
                assertionString(element.getAttribute("value"), text); //verdiğimiz textin yazılıp yazılmadığını kontrol eden fonksiyon
            }
        }
    }

    @FindBy(className = "submitButton")
    private List <WebElement> button;
    public List<WebElement> getButton() { //elementlere ulaşmamızı sağlayan get fonksiyonu

        return button;
    }
    public void clickTheButton(String buttonValue) {

        for (WebElement element: getButton()) {

            if(Objects.equals(element.getAttribute("value"), buttonValue)) { //value eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu

                Actions actions = new Actions(driver);
                actions.scrollToElement(element); //element sayfada ilk başta görünmüyorsa elementin olduğu kısıma ilerletir
                actions.perform();
                clickFunction(element);
            }
        }
    }


}
