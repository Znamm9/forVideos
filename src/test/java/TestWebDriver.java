import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestWebDriver extends TestInit {

    @Test
    public void runGoogle(){
        goToGoogle();
        getSearchField().sendKeys("dogs\n");
        getSearchField().click();
    }

    @Test
    public void clickEnterBtn(){
        goToGoogle();
        driver.findElement(By.xpath("//a[text()='Увійти']")).click();
    }
}
