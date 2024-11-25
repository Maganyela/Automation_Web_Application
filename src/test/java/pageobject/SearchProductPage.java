package pageobject;

import utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {

    private WebDriver driver;

    private ElementUtil elementUtil;

    public SearchProductPage(WebDriver driver) {

        this.driver = driver;
        elementUtil = new ElementUtil(driver);
    }


    public void searchTheProduct(String productType) throws InterruptedException {


        By enterSearchField = By.id("search_query_top");
        elementUtil.enterTxt(enterSearchField,productType);
        elementUtil.sleep(3);
    }

    public void clickSearch() throws InterruptedException {

        By clickSearchField = By.name("submit_search");
        elementUtil.clickElement(clickSearchField);
        elementUtil.sleep(2);
    }

//    public void textSearched() {
//
//        WebElement txtSearchedField = driver.findElement(By.cssSelector(".lighter"));
//        assert(txtSearchedField.getText().equals("Faded Short Sleeve T-shirts"));
//    }
}
