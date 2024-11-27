package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.FilterColorPage;
import testrunner.TestRunner;
import utility.DriverFactory;

public class FilterColorStepDefinition {

    private FilterColorPage filterColorPage;
//    private DriverFactory driverFactory;
    private TestRunner testRunner;
    private WebDriver driver;


    public FilterColorStepDefinition() {

        filterColorPage = new FilterColorPage(TestRunner.getDriver());
//        driverFactory = new DriverFactory();
        driver = TestRunner.getDriver();
        filterColorPage = new FilterColorPage(driver);
    }

    @Given("I am on the dress web page")
    public void i_am_on_the_dress_web_page() {

//        driver = DriverFactory.getDriver();
//        filterColorPage = new FilterColorPage(driver);

        driver.get(TestRunner.getUrl("filterColor.url"));
    }

    @When("I click the White color checkbox")
    public void i_click_the_blue_color_checkbox() throws InterruptedException {

        filterColorPage.clickWhiteColor();
    }
    @When("I click the Black color checkbox")
    public void i_click_the_orange_color_checkbox() throws InterruptedException {

        filterColorPage.clickBlackColor();
    }
    @Then("I should be able to see the product colors")
    public void i_should_be_able_to_see_the_product_colors() {

        filterColorPage.seeColorTxt();
    }
}
