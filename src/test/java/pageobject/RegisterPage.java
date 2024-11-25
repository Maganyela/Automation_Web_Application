package pageobject;

import utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {


    private WebDriver driver;
    private ElementUtil elementUtil;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }


    public void enterEmail(String email) throws InterruptedException {

        By emailField = By.id("email_create");
        elementUtil.enterTxt(emailField, email);
        elementUtil.sleep(2);
    }

    public void clickCreateAccount() throws InterruptedException {

        By clickRegister = By.xpath("//span[contains(.,'Create an account')]");
        elementUtil.clickElement(clickRegister);
        elementUtil.sleep(2);
    }


    // Function to select the Male RadioButton
    public void selectRadioButton(String radioButton) throws InterruptedException {

        if(radioButton.equalsIgnoreCase("Mr")) {
            By maleRadioButton = By.xpath("//div[@class='account_creation']/div[@class='clearfix']//input[@value='1']");
            elementUtil.clickElement(maleRadioButton);
            elementUtil.sleep(2);
        }
        else if (radioButton.equalsIgnoreCase("Mrs"))
        {
            By femaleRadioButton = By.xpath("//input[@value='2']");
            elementUtil.clickElement(femaleRadioButton);

            elementUtil.sleep(2);
        }
    }

    // Function to enter the firstname
    public void enterFirstName(String firstName) throws InterruptedException {

        By firstNameField = By.id("customer_firstname");
        elementUtil.enterTxt(firstNameField, firstName);
        elementUtil.sleep(2);
    }

    // Function to enter the lastname
    public void enterLastName(String lastName) throws InterruptedException {

        By lastNameField = By.id("customer_lastname");
        elementUtil.enterTxt(lastNameField, lastName);
        elementUtil.sleep(2);
    }

    public void enterPassword(String password) throws InterruptedException {
        By passwordField = By.id("passwd");
        elementUtil.enterTxt(passwordField, password);
        elementUtil.sleep(3);
    }


    public void selectDayDropDown(String day) throws InterruptedException {

        // Open the dropdown
        By dayDropDown = By.id("days");
        WebElement dropdownElement = driver.findElement(dayDropDown);
        dropdownElement.click();

        // Locate the option and click it
        By optionLocator = By.xpath("//select[@id='days']/option[contains(.,'10')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();
        elementUtil.sleep(2);
    }

    public void selectMonthDropDown(String month) throws InterruptedException {

        // Open the dropdown
        By monthDropDown = By.id("months");
        WebElement dropdownElement = driver.findElement(monthDropDown);
        dropdownElement.click();

        // Locate the option and click it
        By optionLocator = By.xpath("//option[contains(.,'September')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();
        elementUtil.sleep(2);
    }

    public void selectYearDropDown(String year) throws InterruptedException {

        // Open the dropdown
        By yearDropDown = By.id("years");
        WebElement dropdownElement = driver.findElement(yearDropDown);
        dropdownElement.click();

        // Locate the option and click it
        By optionLocator = By.xpath("//option[contains(.,'2001')]");
        WebElement optionElement = driver.findElement(optionLocator);
        optionElement.click();
        elementUtil.sleep(2);
    }


    public void clickRegisterButton() throws InterruptedException {

        By clickRegister = By.xpath("//span[.='Register']");
        elementUtil.clickElement(clickRegister);
        elementUtil.sleep(2);
    }

    public void confirmUserRegistration() {

        WebElement txtElement = driver.findElement(By.cssSelector(".page-subheading"));
        assert(txtElement.getText().equals("Your personal information"));
    }

}
