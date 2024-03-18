package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects extends AbstractClass {

    WebDriver driver;

    public PageObjects() {

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
    public void typeTck() {

        sendKeysFunctions(tckArea, ""); //value olarak tc kimlik numarası verilmeli
    }

    @FindBy(id = "egpField") //şifre girme alanı
    private WebElement sifreArea;
    public void clickOnSifreArea() {

        clickFunction(sifreArea);
    }
    public void typeSifre() {

        sendKeysFunctions(sifreArea, ""); //value olarak şifre verilmeli
    }

    @FindBy(name = "submitButton") //tc ve şifre yazıldıktan sonra tıklanması gereken giriş yap butonu
    private WebElement girisYapButonu2;
    public void clickOnGirisYapButonu2() {

        clickFunction(girisYapButonu2);
    }

    @FindBy(xpath = "/html/body/main/div/section/aside/ul/li[1]") //sol yanda yer alan mesaj
    private WebElement controlMessage;
    public void leftAreaCheck() {

        assertion(controlMessage, "Bu hizmet çeşitli kurumların işbirliği ile e-Devlet Kapısı altyapısı üzerinden sunulmaktadır. Yerleşim yeri adresinize bağlı hizmetleri görüntüleyebilir ve işlemlerinizi gerçekleştirebilirsiniz.");
    }

    @FindBy(id = "adresDegisiklik")
    private WebElement adresDegisiklikButon;
    public void clickOnAdresDegisiklikButon() {

        clickFunction(adresDegisiklikButon);
    }

    @FindBy(className = "richText")
    private WebElement serviceInfoMessage;
    public void serviceCheck() {

        assertion(serviceInfoMessage, "Bu hizmeti kullanarak, yerleşim yeri adresi ve/veya diğer adres bildiriminde bulunabilirsiniz.");
    }
}
