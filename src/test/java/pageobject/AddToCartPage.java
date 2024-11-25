package pageobject;

import utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {


    private ElementUtil elementUtil;
    private WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    public void clickWhiteColor() throws InterruptedException {

        By clickWhiteField = By.name("White");
        elementUtil.clickElement(clickWhiteField);

        elementUtil.sleep(2);
    }

    public void clickAddCart() throws InterruptedException {

        By addCartButton = By.xpath("//span[.='Add to cart']");
        elementUtil.clickElement(addCartButton);

        elementUtil.sleep(2);
    }

    public void clickCashoutButton() throws InterruptedException {

        By clickProceedCashout = By.xpath("//span[contains(.,'Proceed to checkout')]");
        elementUtil.clickElement(clickProceedCashout);

        elementUtil.sleep(2);
    }

    public void summaryCart() {

//        WebElement txtSummaryCart = driver.findElement(By.id("cart_title"));
//        assert(txtSummaryCart.getText().equals("Shopping-cart summary"));
    }

}
