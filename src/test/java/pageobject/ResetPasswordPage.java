package pageobject;

import utility.DriverFactory;
import utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {

    private ElementUtil elementUtil;
    private WebDriver driver;
    DriverFactory ui;

    public ResetPasswordPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
        this.ui = new DriverFactory();
    }

    public void clickForgotPassword() throws InterruptedException {

        By forgotPassword = By.xpath("//a[.='Forgot your password?']");
        elementUtil.clickElement(forgotPassword);

        elementUtil.sleep(2);
    }

    public void enterEmail(String emailAddress) throws InterruptedException {

        By emailField = By.id("email");
        elementUtil.enterTxt(emailField,emailAddress);

        elementUtil.sleep(2);
    }

    public void clickRecoveryPassword() {

        By recoveryButton = By.xpath("//span[.='Retrieve Password']");
        elementUtil.clickElement(recoveryButton);
    }

    public void showSuccessfulMessage() {

        WebElement txtSuccessfulMessage = driver.findElement(By.cssSelector(".alert"));
        assert(txtSuccessfulMessage.getText().equals("A confirmation email has been sent to your address: vitwendmpho@gmail.com"));
    }
}
