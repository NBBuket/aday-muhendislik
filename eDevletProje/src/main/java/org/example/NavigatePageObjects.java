package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Objects;

public class NavigatePageObjects extends AbstractClass {

    WebDriver driver;

    //Driver ile açılan sayfadaki elementleri bulmamıza yardımcı olan constructor
    public NavigatePageObjects() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }


    //sol yanda yer alan bilgilendirme mesaj
    @FindBy(xpath = "/html/body/main/div/section/aside/ul/li[1]")
    private WebElement controlMessage;

    //class'ı comboBox olan elementler
    @FindBy(className = "comboBox")
    private List<WebElement> comboBoxIdNames;

    //elementlere ulaşmamızı sağlayan get fonksiyonu
    public List<WebElement> getComboBoxIdNames() {

        return comboBoxIdNames;
    }

    //class'ı checkBox olan elementler
    @FindBy(className = "checkBox")
    private List <WebElement> checkBoxElement;

    //elementlere ulaşmamızı sağlayan get fonksiyonu
    public List<WebElement> getCheckBoxElement() {

        return checkBoxElement;
    }

    //class'ı text & textarea olan elementler
    @FindAll({
            @FindBy(className = "text"),
            @FindBy(className = "textarea")}
    )
    private List <WebElement> textElement;

    //elementlere ulaşmamızı sağlayan get fonksiyonu
    public List<WebElement> getTextElement() {

        return textElement;
    }

    //class'ı submitButton olan elementler
    @FindBy(className = "submitButton")
    private List <WebElement> button;

    //elementlere ulaşmamızı sağlayan get fonksiyonu
    public List<WebElement> getButton() {

        return button;
    }

    //id'si tarih olan tarih input alanı
    @FindBy(id = "tarih")
    private WebElement date;

    //üstünde işaretleme yapılabilen pop-up takvim
    @FindBy(className = "edui-date__toggle")
    private WebElement calendar;



    //kontrol mesajını konsola yazdıran fonksiyon
    public void infoBoxCheck() {

        InfoLog infoMessage = new InfoLog();
        infoMessage.sampleLog(controlMessage.getText());
    }


    //verilen id ve value ile combobox için işaretleme yapan fonksiyon
    public void clickOnComboBox(String comboBoxId, String givenValue) {

        //elementleri tek tek gezerek verilen id'yi arayan for döngüsü
        for (WebElement element : getComboBoxIdNames()) {

            //id eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu
            if(Objects.equals(element.getAttribute("id"), comboBoxId)) {

                InfoLog infoMessage = new InfoLog();
                selectElementFromDropdown(element, givenValue);

                if(element.isDisplayed()) {

                    infoMessage.sampleLog("Verification succeed");
                } else {

                    infoMessage.sampleLog("Verification failed");
                }
            }
        }

    }


    //verilen id ve value ile checkbox için işaretleme yapan fonksiyon
    public void clickOnCheckBox(String checkBoxId){

        //elementleri tek tek gezerek verilen id'yi arayan for döngüsü
        for (WebElement element: getCheckBoxElement()) {

            //id eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu
            if(Objects.equals(element.getAttribute("id"), checkBoxId)) {

                //element sayfada ilk başta görünmüyorsa elementin olduğu kısıma ilerletir
                Actions actions = new Actions(driver);
                actions.moveToElement(element).perform();

                wait.until(ExpectedConditions.elementToBeClickable(element));
                InfoLog infoMessage = new InfoLog();

                //verilen id'deki checkbox'ın işaretlenmesini kontrol eden if koşulu
                if(!element.isSelected()) {

                    element.click();
                    infoMessage.sampleLog("Marking succeed");
                } else {

                    infoMessage.sampleLog("Marking is not necessary");
                }
            }
        }

    }


    //verilen id ve text için text'i uygun yere yazdıran fonksiyon
    public void clickOnTextBoxAndWrite(String textBox, String text) {

        for (WebElement element: getTextElement()) {

            //id eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu
            if(Objects.equals(element.getAttribute("id"), textBox)) {

                //element sayfada ilk başta görünmüyorsa elementin olduğu kısıma ilerletir
                Actions actions = new Actions(driver);
                actions.scrollToElement(element).perform();
                clickFunction(element);
                element.clear();
                sendKeysFunctions(element, text);

                //verdiğimiz textin yazılıp yazılmadığını kontrol eden fonksiyon
                assertionString(element.getAttribute("value"), text);
            }
        }
    }


    //value'su verilen butona tıklayan fonskiyon
    public void clickTheButton(String buttonValue) {

        for (WebElement element: getButton()) {

            //value eşleştiğinde verilen değerin seçilmesini sağlayan if koşulu
            if(Objects.equals(element.getAttribute("value"), buttonValue)) {

                //element sayfada ilk başta görünmüyorsa elementin olduğu kısıma ilerletir
                Actions actions = new Actions(driver);
                actions.scrollToElement(element);
                actions.perform();
                clickFunction(element);
            }
        }
    }


    //verilen tarihi yazdıran fonksiyon
    public void pickTheDate(String givenDate) {

        sendKeysFunctions(date, givenDate);
    }


    //yazdırılan tarihin takvimdeki doğruluğunu kontrol eden fonksiyon
    public void checkCalendar() {

        clickFunction(calendar);
    }
}