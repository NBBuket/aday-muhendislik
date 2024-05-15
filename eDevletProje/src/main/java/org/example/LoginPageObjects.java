package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileReader;
import java.io.IOException;

public class LoginPageObjects extends AbstractClass {

    WebDriver driver;

    public LoginPageObjects() { //Driver ile açılan sayfadaki elementleri bulmamıza yardımcı olan constructor

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
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
    public void typeTck(String fileName) {

        JSONParser parser = new JSONParser();
        Object obj;
        try (FileReader reader = new FileReader(fileName)) {
            obj = parser.parse(reader);
            JSONObject person = (JSONObject) obj;
            String tck = (String) person.get("tck");
            sendKeysFunctions(tckArea, tck);

        } catch (IOException | ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    @FindBy(id = "egpField") //şifre girme alanı
    private WebElement sifreArea;
    public void clickOnSifreArea() {

        clickFunction(sifreArea);
    }
    public void typeSifre(String fileName) {
        JSONParser parser = new JSONParser();
        Object obj;
        try (FileReader reader = new FileReader(fileName)) {
            obj = parser.parse(reader);
            JSONObject person = (JSONObject) obj;
            String password = (String) person.get("password");
            sendKeysFunctions(sifreArea, password);

        } catch (IOException | ParseException ex) {
            throw new RuntimeException(ex);
        }
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
