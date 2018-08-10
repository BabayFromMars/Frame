package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "myDir/chromedriver.exe");
         driver = new ChromeDriver();
 //       driver.get("http://www.i.ua/");
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}

