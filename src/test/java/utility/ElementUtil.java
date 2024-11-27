package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementUtil {

    private WebDriver driver;

    // initiate the driver
    public ElementUtil(WebDriver driver) {
        this.driver = driver;

    }

    // Enter text function
    public void enterTxt(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    // Click Button or Element
    public void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    public void sleep(int seconds)  {

        try {
            Thread.sleep(seconds * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
