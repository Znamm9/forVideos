package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AmazonHomePageHelper;
import pageObjects.AmazonSearchResultsPage;

public class TestAmazon extends TestInit {

    @Test
    public void checkHeader(){
        AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
        amazonHomePageHelper.navigateAmazon();

        Assert.assertTrue(amazonHomePageHelper.getLogoImage().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getDeliverTo().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getSearchField().isDisplayed());
        Assert.assertTrue(amazonHomePageHelper.getSearchImageBtn().isDisplayed());
    }

    @Test
    public void checkSeach(){
        AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
        amazonHomePageHelper.navigateAmazon();

        amazonHomePageHelper.getSearchField().sendKeys("hat");
        amazonHomePageHelper.getSearchImageBtn().click();

        AmazonSearchResultsPage amazonSearchResultsPage = new AmazonSearchResultsPage(driver);
        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
    }

    @Test
    public void checkSeachPen(){
        AmazonHomePageHelper amazonHomePageHelper = new AmazonHomePageHelper(driver);
        amazonHomePageHelper.navigateAmazon();

        AmazonSearchResultsPage amazonSearchResultsPage = amazonHomePageHelper.search("Pen");

        Assert.assertTrue(amazonSearchResultsPage.getResultsField().isDisplayed());
        Assert.assertTrue(amazonSearchResultsPage.getElementsWithPenText().size() > 10);
    }
}
