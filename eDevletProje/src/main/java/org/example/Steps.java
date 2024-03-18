package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Steps {

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

    @Given("click TC Kimlik No area")
    public void click_tc_kimlik_no_area() {

        page.clickOnTckArea();
    }

    @Given("type tck")
    public void type_tck() {

        page.typeTck();
    }

    @Given("click e-Devlet sifresi area")
    public void click_e_devlet_sifresi_area() {

        page.clickOnSifreArea();
    }

    @Given("type password")
    public void type_password() {

        page.typeSifre();
    }

    @Given("click on giris yap button")
    public void click_on_giris_yap_button() {

        page.clickOnGirisYapButonu2();
    }

    @When("navigate to location link")
    public void navigate_to_location_link() {

        driver.get("https://www.turkiye.gov.tr/ikametgahim-adrese-bagli-hizmetler");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

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
