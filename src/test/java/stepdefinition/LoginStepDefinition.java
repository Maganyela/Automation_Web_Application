package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.LoginPage;
import utility.DriverFactory;
import utility.ExcelReader;

import java.io.IOException;

public class LoginStepDefinition {

    private DriverFactory driverFactory;
    private ExcelReader excelReader;
    private LoginPage loginPage;
    private WebDriver driver;

    // Static variables to hold browser
    public static String browser;

    public LoginStepDefinition() {
        driverFactory = new DriverFactory();
        excelReader = new ExcelReader();
    }

    @Given("I am on the Web Application page")
    public void i_am_on_the_web_application_page() {
        // Initialize the driver with the browser from the static variable
        driver = driverFactory.init_driver();
        loginPage = new LoginPage(driver);
        // Navigate to the URL from config.properties
        driver.get(DriverFactory.getUrl("login.url"));
    }

    @When("I click on the Sign in text")
    public void i_click_on_the_sign_in_text() throws IOException, InterruptedException {
        loginPage.clickRegisterText();
    }

    @When("I enter the email")
    public void i_enter_the_email() throws IOException {
        String email = excelReader.readExcelCellValue("Username", 2, 1);
        loginPage.enterEmail(email);
    }

    @When("I enter the password")
    public void i_enter_the_password() throws IOException {
        String password = excelReader.readExcelCellValue("Password", 2, 2);
        loginPage.enterPassword(password);
    }

    @When("I click on the Sign In button")
    public void i_click_on_the_sign_in_button() {
        loginPage.clickLogin();
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        // Add assertion logic here to verify login success
    }
}
