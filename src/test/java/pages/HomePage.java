package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

 //   WebDriver driver;

/*    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }*/

    @FindBy(xpath="//ul[@class='sn_menu']/li[1]")
	private WebElement labelUserEmail;

    public String getLabelUserEmail() {
        return labelUserEmail.getText();
    }
}
