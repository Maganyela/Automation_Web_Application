package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobject.SelectCategoryPage;
import testrunner.TestRunner;
import utility.DriverFactory;

public class SelectCategoryStepDefinition {

    private SelectCategoryPage selectCategoryPage;
//    private DriverFactory driverFactory;
    private TestRunner testRunner;
    private WebDriver driver;

    public SelectCategoryStepDefinition() {

        selectCategoryPage = new SelectCategoryPage(driver);
//        driverFactory = new DriverFactory();
        driver = TestRunner.getDriver();
        selectCategoryPage = new SelectCategoryPage(driver);
    }
    @Given("I am on the Select Category page")
    public void i_am_on_the_select_category_page() {
        driver.get(TestRunner.getUrl("category.url"));

    }
    @When("I click on the Dresses button")
    public void i_click_on_the_dresses_button() throws InterruptedException {
        selectCategoryPage.clickDressButton();
    }
    @When("I click on Casual dress checkbox")
    public void i_click_on_casual_dress_checkbox() throws InterruptedException {

        selectCategoryPage.clickCasualCheckbox();
    }
    @When("I click on Evening dress checkbox")
    public void i_click_on_evening_dress_checkbox() throws InterruptedException {

        selectCategoryPage.clickEvenCheckbox();
    }
    @When("I click on Summer dress checkbox")
    public void i_click_on_summer_dress_checkbox() throws InterruptedException {

        selectCategoryPage.clickSummerCheckboxField();
    }
    @Then("I should be able to see the different product")
    public void i_should_be_able_to_see_the_different_product() {
        selectCategoryPage.seeCategories();
    }

}
