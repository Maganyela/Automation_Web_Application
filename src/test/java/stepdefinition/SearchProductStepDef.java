package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.SearchProductPage;
import utility.DriverFactory;

public class SearchProductStepDef {

    private SearchProductPage searchProductPage;
    private DriverFactory driverFactory;
    private WebDriver driver;



    public SearchProductStepDef() {

        searchProductPage = new SearchProductPage(DriverFactory.getDriver());
        driverFactory = new DriverFactory();
        ;
    }

    @Given("I am on the Search Page")
    public void i_am_on_the_search_page() {
        driver = driverFactory.init_driver();
        searchProductPage = new SearchProductPage(driver);

        driver.get(DriverFactory.getUrl("search.url"));
    }

    @When("I search any product on the search bar")
    public void i_search_any_product_on_the_search_bar() throws InterruptedException {

        searchProductPage.searchTheProduct("Faded Short Sleeve T-shirts");
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() throws InterruptedException {

        searchProductPage.clickSearch();
    }

    @Then("the user should see the text that is used to search")
    public void i_should_be_able_to_see_the_productt() {

//        searchProductPage.textSearched();
    }
}
