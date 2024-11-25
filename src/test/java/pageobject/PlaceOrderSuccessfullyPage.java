package pageobject;

import utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class PlaceOrderSuccessfullyPage {


    private WebDriver driver;

    private ElementUtil elementUtil;

    public PlaceOrderSuccessfullyPage(WebDriver driver) {

        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }

    public void clickTheCashOut() {

        By addCartButton = By.xpath("//span[.='Add to cart']");
        elementUtil.clickElement(addCartButton);

        elementUtil.sleep(2);
    }
    public void clickProceedCashOut() throws InterruptedException {

        By clickCashOutButton = By.xpath("//span[contains(.,'Proceed to checkout')]");
        elementUtil.clickElement(clickCashOutButton);

        elementUtil.sleep(2);
    }

    public void clickProceedCashOutSummary() throws InterruptedException {

        By clickCashOutSummary = By.xpath("//span[.='Proceed to checkout']");
        elementUtil.clickElement(clickCashOutSummary);

        elementUtil.sleep(2);
    }


    public void clickProceedCashOutAddress() throws InterruptedException {

        By clickProceedCashOut = By.xpath("//span[.='Proceed to checkout']");
        elementUtil.clickElement(clickProceedCashOut);

        elementUtil.sleep(2);
    }


    public void clickCashOutBtn() throws InterruptedException {

        By clickCheckbox = By.id("cgv");
        By clickCashOut = By.xpath("//button[@name='processCarrier']/span[contains(.,'Proceed to checkout')]");

        elementUtil.clickElement(clickCheckbox);
        elementUtil.sleep(3);
        elementUtil.clickElement(clickCashOut);

        elementUtil.sleep(2);
    }

    public void clickCashCheckPayment() throws InterruptedException {

        By clickCashCheckBtn = By.cssSelector(".cheque");
        elementUtil.clickElement(clickCashCheckBtn);

        elementUtil.sleep(2);
    }


    public void clickConfirmOrder() throws InterruptedException {

        By clickConfirmOrderBtn = By.xpath("//span[.='I confirm my order']");
        elementUtil.clickElement(clickConfirmOrderBtn);

        elementUtil.sleep(2);
    }

    public void clickOrderHistory() throws InterruptedException {

        By clickViewOrderHistory = By.cssSelector(".button-exclusive");
        elementUtil.clickElement(clickViewOrderHistory);

        elementUtil.sleep(3);
    }

    public void clickBackToAccount() throws InterruptedException {

        By clickBackToAccountBtn = By.xpath("//span[contains(.,'Back to Your Account')]");
        elementUtil.clickElement(clickBackToAccountBtn);

        elementUtil.sleep(2);
    }

    public void confirHomeLogo() {

        WebElement logo = driver.findElement(By.cssSelector("[alt='My Shop']"));
        assertTrue(logo.isDisplayed());
    }
}
