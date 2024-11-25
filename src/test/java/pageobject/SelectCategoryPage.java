package pageobject;

import utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectCategoryPage {


    private ElementUtil elementUtil;
    private WebDriver driver;

    public SelectCategoryPage(WebDriver driver) {

        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);

    }

    public void clickDressButton() throws InterruptedException {

        By clickDressButton = By.cssSelector(".sf-menu > li > [title='Dresses']");
        elementUtil.clickElement(clickDressButton);

        elementUtil.sleep(2);
    }

    public void clickCasualCheckbox() throws InterruptedException {

        By clickCasualCheckbocField = By.xpath("//input[@value='9']");
        elementUtil.clickElement(clickCasualCheckbocField);

        elementUtil.sleep(3);
    }

    public void clickEvenCheckbox() throws InterruptedException {

        By clickEvenCheckboxField = By.xpath("//input[@value='10']");
        elementUtil.clickElement(clickEvenCheckboxField);

        elementUtil.sleep(3);
    }

    public void clickSummerCheckboxField() throws InterruptedException {

        By clickSummerCheckboxField = By.xpath("//input[@value='11']");
        elementUtil.clickElement(clickSummerCheckboxField);

        elementUtil.sleep(3);
    }

    public void seeCategories() {

//        WebElement txtCategories = driver.findElement(By.cssSelector(".cat-name"));
//        assert(txtCategories.getText().equals("Dresses > Categories Casual Dresses/Evening Dresses/Summer Dresses"));
    }
}
