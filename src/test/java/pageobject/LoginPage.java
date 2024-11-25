package pageobject;

import utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private ElementUtil elementUtil;


    public LoginPage(WebDriver driver) {

        this.driver = driver;
        elementUtil = new ElementUtil(driver);

    }

    public void clickRegisterText() throws InterruptedException {

        By registerText = By.cssSelector(".login");
        elementUtil.clickElement(registerText);

        elementUtil.sleep(2);
    }

    public void enterEmail(String email) {

        By enterEmailField = By.id("email");
        elementUtil.enterTxt(enterEmailField, email);
        elementUtil.sleep(2);
    }

    public void enterPassword(String password) {

        By enterPasswordField = By.id("passwd");
        elementUtil.enterTxt(enterPasswordField, password);
        elementUtil.sleep(2);
    }

    public void clickLogin() {
        By clickLoginBtn = By.xpath("//span[contains(.,'Sign in')]");
        elementUtil.clickElement(clickLoginBtn);
        elementUtil.sleep(1);
    }
}
