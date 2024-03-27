package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    private WebDriver driver;
    LoginPageObjects page = new LoginPageObjects();
    NavigatePageObjects navPage = new NavigatePageObjects();

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

    @When("click on giris yap button")
    public void click_on_giris_yap_button() {

        page.clickOnGirisYapButonu2();
    }

    @Then("check the main info")
    public void checkTheMainInfo() {

        page.mainInfoCheck();
    }

    @When("navigate to the given link {string}")
    public void navigate_to_the_given_link(String link) {

        driver.get(link);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Then("check the info box")
    public void check_the_info_box() {

        navPage.infoBoxCheck();
    }

    @Then("click on combo box {string}")
    public void clickOnComboBox(String comboBoxElement) {

        navPage.clickOnComboBox(comboBoxElement);
    }
}
