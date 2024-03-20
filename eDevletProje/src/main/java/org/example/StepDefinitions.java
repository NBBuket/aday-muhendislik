package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    private WebDriver driver;
    PageObjects page = new PageObjects();

    @Given("open the website")
    public void open_the_website() {

        driver = Driver.getDriver();
        driver.get("https://www.turkiye.gov.tr/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("click Giris Yap button")
    public void click_giris_yap_button() {

        page.clickOnGirisYapButonu();
    }

    @And("type tck {string}")
    public void typeTck(String tck) {

        page.clickOnTckArea();
        page.typeTck(tck);
    }

    @And("type password {string}")
    public void typeSifre(String password) {

        page.clickOnSifreArea();
        page.typeSifre(password);
    }

    @And("click on giris yap button")
    public void click_on_giris_yap_button() {

        page.clickOnGirisYapButonu2();
    }

    @When("navigate to location link")
    public void navigate_to_location_link() {

        driver.get("https://www.turkiye.gov.tr/ikametgahim-adrese-bagli-hizmetler");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    /* Genel bir yönlendirme yapmak istediğimizde kullanılacak olan navigate fonksiyonu
    @When("navigate to location link")
    public void navigate_to_location_link(String link) {

        driver.get(link);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    */

    @Then("check the left info area")
    public void check_the_left_info_area() {

        page.leftAreaCheck();
    }

    @When("click on adres degisiklik button")
    public void click_on_adres_degisiklik_button() {

        page.clickOnAdresDegisiklikButon();
    }

    @Then("check the service info message")
    public void check_the_service_info_message() {

        page.serviceCheck();
    }
}
