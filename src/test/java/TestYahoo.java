import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestYahoo extends TestInit{

    @Test
    public void clickEnterBtn(){
        goToYahoo();
        driver.findElement(By.xpath("//a[text()='Увійти']")).click();

    }

    @Test
    public void clickEnterBtnv2(){
        driver.get("https://www.bing.com/");
        driver.findElement(By.xpath("//a[text()='Увійти']")).click();
    }
}
