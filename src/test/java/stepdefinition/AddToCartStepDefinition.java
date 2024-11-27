package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.AddToCartPage;
import testrunner.TestRunner;
import utility.DriverFactory;

public class AddToCartStepDefinition {

    private AddToCartPage addToCartPage;
//    private DriverFactory driverFactory;
    private TestRunner testRunner;
    private WebDriver driver;


    public AddToCartStepDefinition() {

        addToCartPage = new AddToCartPage(driver);
//        driverFactory = new DriverFactory();
        driver = TestRunner.getDriver();
        addToCartPage = new AddToCartPage(driver);
    }

    @Given("I am on the Dress color page")
    public void i_am_on_the_dress_color_page() {

        driver.get(TestRunner.getUrl("addToCart.url"));
    }
    @When("I click the White color")
    public void i_click_the_white_color() throws InterruptedException {

        addToCartPage.clickWhiteColor();
    }
    @When("I click the Add to cart button")
    public void i_click_the_add_to_cart_button() throws InterruptedException {

        addToCartPage.clickAddCart();
    }
    @When("I click the Proceed to cashOut button")
    public void i_click_the_proceed_to_cash_out_button() throws InterruptedException {

        addToCartPage.clickCashoutButton();
    }
    @Then("The product should be in the cart ready for cashOut")
    public void the_product_should_be_in_the_cart_ready_for_cash_out() {

        addToCartPage.summaryCart();
    }
}
