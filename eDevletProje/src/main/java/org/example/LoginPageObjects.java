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
import java.util.concurrent.TimeUnit;

public class LoginPageObjects extends AbstractClass {

    WebDriver driver;

    //Driver ile açılan sayfadaki elementleri bulmamıza yardımcı olan constructor
    public LoginPageObjects() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }

    //e-Devlet sayfası ilk açıldığında karşımıza çıkan giriş yap butonu
    @FindBy(id = "l")
    private WebElement girisYapButonu;

    //tc kimlik no girme alanı
    @FindBy(id = "tridField")
    private WebElement tckArea;

    //şifre girme alanı
    @FindBy(id = "egpField")
    private WebElement sifreArea;

    //tc ve şifre yazıldıktan sonra tıklanması gereken giriş yap butonu
    @FindBy(name = "submitButton")
    private WebElement girisYapButonu2;

    //e-devlete giriş yaptığımızda arama kısmının altındaki mesaj
    @FindBy(className = "first")
    private WebElement mainInfo;


    //driver oluşturup e-devleti açan fonksiyon
    public void openTheWebsite() {

        driver = Driver.getDriver();
        driver.get("https://www.turkiye.gov.tr/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        clickFunction(girisYapButonu);
    }

    //verilen dosyadan bilgileri çekerek sisteme giriş yapan fonksiyon
    public void loginInfo(String fileName) {

        JSONParser parser = new JSONParser();
        JSONObject obj;

        try (FileReader reader = new FileReader(fileName)) {

            obj = (JSONObject) parser.parse(reader);

            //dosyadan okunan tck ve şifre stringe çevrilir
            String tck = (String) obj.get("tck");
            String password = (String) obj.get("password");

            clickFunction(tckArea);
            sendKeysFunctions(tckArea, tck);
            clickFunction(sifreArea);
            sendKeysFunctions(sifreArea, password);
            clickFunction(girisYapButonu2);

        } catch (IOException | ParseException ex) {

            throw new RuntimeException(ex);
        }
    }

    //giriş yaptıktan sonra bunu onaylamak ve driverı kapatmak için kullanılan fonksiyon
    public void mainInfoCheck() {

        assertion(mainInfo, "e-Devlet Kapısı ile bilgi ve belgelerinize tek noktadan ulaşabilir, başvuru işlemlerinizi hızla gerçekleştirebilirsiniz");
        driver.quit();
    }
}