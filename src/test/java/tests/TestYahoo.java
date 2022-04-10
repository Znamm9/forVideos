package tests;

import org.testng.annotations.Test;
import pageObjects.YahooHomePage;

public class TestYahoo extends TestInit{

    @Test
    public void clickEnterBtn(){
        goToYahoo();
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getEnterBtn().click();

    }

    @Test
    public void clickEnterBtnv2(){
        driver.get("https://www.bing.com/");
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getEnterBtn().click();
    }
}
