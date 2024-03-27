package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects extends AbstractClass {

    WebDriver driver;

    public LoginPageObjects() { //Driver ile açılan sayfadaki elementleri bulmamıza yardımcı olan constructor

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "l")
    private WebElement girisYapButonu; //e-Devlet sayfası ilk açıldığında karşımıza çıkan giriş yap butonu
    public void clickOnGirisYapButonu() {

        clickFunction(girisYapButonu);
    }

    @FindBy(id = "tridField")
    private WebElement tckArea; //tc kimlik no girme alanı
    public void clickOnTckArea() {

        clickFunction(tckArea);
    }
    public void typeTck(String tck) {

        sendKeysFunctions(tckArea, tck);
    }

    @FindBy(id = "egpField") //şifre girme alanı
    private WebElement sifreArea;
    public void clickOnSifreArea() {

        clickFunction(sifreArea);
    }
    public void typeSifre(String password) {

        sendKeysFunctions(sifreArea, password);
    }

    @FindBy(name = "submitButton") //tc ve şifre yazıldıktan sonra tıklanması gereken giriş yap butonu
    private WebElement girisYapButonu2;
    public void clickOnGirisYapButonu2() {

        clickFunction(girisYapButonu2);
    }

    @FindBy(className = "first")
    private WebElement mainInfo; //e-devlete giriş yaptığımızda arama kısmının altındaki mesaj

    public void mainInfoCheck() {

        assertion(mainInfo, "e-Devlet Kapısı ile bilgi ve belgelerinize tek noktadan ulaşabilir, başvuru işlemlerinizi hızla gerçekleştirebilirsiniz");
    }
}
