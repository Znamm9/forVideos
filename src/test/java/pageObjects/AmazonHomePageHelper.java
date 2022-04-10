package pageObjects;

import org.openqa.selenium.WebDriver;

public class AmazonHomePageHelper extends AmazonHomePageElements {
    public AmazonHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void navigateAmazon() {
        driver.get("https://www.amazon.com/");
    }

    public AmazonSearchResultsPage search(String objectForSearch) {
        getSearchField().sendKeys(objectForSearch);
        getSearchImageBtn().click();

        return new AmazonSearchResultsPage(driver);
    }
}
