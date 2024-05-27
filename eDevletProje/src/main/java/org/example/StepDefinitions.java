package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    private WebDriver driver;
    LoginPageObjects logPage = new LoginPageObjects();
    NavigatePageObjects navPage = new NavigatePageObjects();


    @Given("open the website")
    public void open_the_website() {

        logPage.openTheWebsite();
    }

    @And("use data given in {string}")
    public void useDataGivenIn(String fileName) {

        logPage.loginInfo(fileName);
    }

    @Then("check the main info")
    public void checkTheMainInfo() {

        logPage.mainInfoCheck();
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

    @And("click on the combo box {string} and select {string}")
    public void clickOnTheComboBoxAndSelect(String idName, String elementValue) {

        navPage.clickOnComboBox(idName, elementValue);
    }

    @And("click on the check box {string} and select")
    public void clickOnTheCheckBoxAndSelect(String checkBoxId) {

        navPage.clickOnCheckBox(checkBoxId);
    }

    @And("click on the text box {string} and write {string}")
    public void clickOnTheTextBoxAndWrite(String textBox, String text) {

        navPage.clickOnTextBoxAndWrite(textBox, text);
    }

    @And("click on the textArea box {string} and write {string}")
    public void clickOnTheTextAreaBoxAndWrite(String textAreaBox, String text) {

        navPage.clickOnTextBoxAndWrite(textAreaBox, text);
    }

    @Then("click the button {string}")
    public void clickTheButton(String buttonValue) {

        navPage.clickTheButton(buttonValue);
    }

    @And("pick the given date {string}")
    public void pickTheGivenDate(String givenDate) {

        navPage.pickTheDate(givenDate);
    }

    @Then("check the date")
    public void checkTheDate() {

        navPage.checkCalendar();
    }
}