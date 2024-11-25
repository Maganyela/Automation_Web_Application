package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.RegisterPage;
import utility.DriverFactory;

public class RegisterStepDefinition {

    private RegisterPage registerPage;

    public RegisterStepDefinition() {

        registerPage = new RegisterPage(DriverFactory.getDriver());
    }

    @When("I enter email")
    public void i_enter_as_email() throws InterruptedException {
        registerPage.enterEmail("nfndd@gmail.com");

    }


    @When("I click on the create an account button")
    public void i_click_on_the_create_an_account_button() throws InterruptedException {
        registerPage.clickCreateAccount();
    }


    @When("I select the radiobutton")
    public void i_select_the_radiobutton() throws InterruptedException {

        registerPage.selectRadioButton("Mr");
    }

    @When("I enter firstname")
    public void i_enter_as_firstname() throws InterruptedException {
        registerPage.enterFirstName("Vitwend");
    }

    @When("I enter lastname")
    public void i_enter_as_lastname() throws InterruptedException {
        registerPage.enterLastName("Maganyela");
    }

    @When("I enter password")
    public void i_enter_as_password() throws InterruptedException {
        registerPage.enterPassword("Maganyela@09");
    }

    @When("I select from the day dropdown")
    public void i_select_from_the_day_dropdown() throws InterruptedException {
        registerPage.selectDayDropDown("10");
    }

    @When("I select from the month dropdown")
    public void i_select_from_the_dropdown() throws InterruptedException {
        registerPage.selectMonthDropDown("September");
    }

    @When("I select from the year dropdown")
    public void i_select_from_the_year_dropdown() throws InterruptedException {
        registerPage.selectYearDropDown("2001");
    }


    @When("I click on the Register button")
    public void i_click_on_the_register_button() throws InterruptedException {
        registerPage.clickRegisterButton();
    }
    @Then("I should be registered")
    public void i_should_be_registered() {

    }
}
