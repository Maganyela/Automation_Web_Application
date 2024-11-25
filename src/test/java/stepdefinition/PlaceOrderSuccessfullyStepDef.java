package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.PlaceOrderSuccessfullyPage;
import utility.DriverFactory;

public class PlaceOrderSuccessfullyStepDef {

    private PlaceOrderSuccessfullyPage placeOrderSuccessfullyPage;
    private DriverFactory driverFactory;
    private WebDriver driver;


    public PlaceOrderSuccessfullyStepDef() {

        placeOrderSuccessfullyPage = new PlaceOrderSuccessfullyPage(DriverFactory.getDriver());
        driverFactory = new DriverFactory();
    }

    @Given("I am on the Cash out page")
    public void i_am_on_the_cash_out_page() {

        driver = driverFactory.init_driver();
        placeOrderSuccessfullyPage = new PlaceOrderSuccessfullyPage(driver);

        driver.get(DriverFactory.getUrl("cashOut.url"));
    }


    @When("I click the Add to cart buttons")
    public void i_click_the_add_to_cart_buttons() {

        placeOrderSuccessfullyPage.clickTheCashOut();
    }
    @When("I click the Proceed to cashOut Initially")
    public void i_click_the_proceed_to_cash_out_initially() throws InterruptedException {

        placeOrderSuccessfullyPage.clickProceedCashOut();
    }
    @When("I click on the Proceed to cashOut on Summary stage")
    public void i_click_on_the_proceed_to_cash_out_on_summary_stage() throws InterruptedException {

        placeOrderSuccessfullyPage.clickProceedCashOutSummary();
    }

    @When("I click the proceed to cashOut on Address stage")
    public void i_click_the_proceed_to_cash_out_on_address_stage() throws InterruptedException {

        placeOrderSuccessfullyPage.clickProceedCashOutAddress();
    }

    @When("I click the proceed to cashOut on Shipping stage")
    public void i_click_the_proceed_to_cash_out_on_shipping_stage() throws InterruptedException {

        placeOrderSuccessfullyPage.clickCashOutBtn();
    }
    @When("I click on the Cash by check on Payment stage")
    public void i_click_on_the_cash_by_check_on_payment_stage() throws InterruptedException {

        placeOrderSuccessfullyPage.clickCashCheckPayment();
    }
    @When("I click on the confirm my order button")
    public void i_click_on_the_confirm_my_order_button() throws InterruptedException {

        placeOrderSuccessfullyPage.clickConfirmOrder();
    }
    @When("I click on the view order history button")
    public void i_click_on_the_view_order_history_button() throws InterruptedException {

        placeOrderSuccessfullyPage.clickOrderHistory();
    }
    @When("I click on the back to you account button")
    public void i_click_on_the_back_to_you_account_button() throws InterruptedException {

        placeOrderSuccessfullyPage.clickBackToAccount();
    }
    @Then("I should navigate to the home page and verify home logo")
    public void i_should_navigate_to_the_home_page_and_verify_home_logo() throws InterruptedException {


        placeOrderSuccessfullyPage.confirHomeLogo();
    }

}
