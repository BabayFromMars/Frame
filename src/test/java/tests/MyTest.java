package tests;

import com.it.App;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class MyTest extends BaseTest {
    @Test
    public void testName() {

        app.login.login(validUser.getLogin(), validUser.getPassword());
        Assert.assertEquals(app.home.getLabelUserEmail(), validUser.getEmail());


        /*driver.findElement(By.xpath("//input[@name='login']")).sendKeys("ittest2", Keys.TAB);
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("337774a", Keys.TAB);
        driver.findElement(By.xpath("//form[@name='lform']//input[@type='submit']")).click();
        String text = driver.findElement(By.xpath("//ul[@class='sn_menu']/li[1]")).getText();*/


    }
}
