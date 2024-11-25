package pageobject;

import utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterColorPage {


    private ElementUtil elementUtil;
    private WebDriver driver;

    public FilterColorPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    public void clickWhiteColor() throws InterruptedException {

        By clickBlueField  = By.name("White");
        elementUtil.clickElement(clickBlueField);

        elementUtil.sleep(4);
    }

    public void clickBlackColor() throws InterruptedException {

        By clickOrangeField = By.name("Black");
        elementUtil.clickElement(clickOrangeField);

        elementUtil.sleep(4);
    }

    public void seeColorTxt() {

//        WebElement txtColor = driver.findElement(By.xpath("//label[contains(.,'Color')]"));
//        assert(txtColor.getText().equals("Color"));
    }
}
