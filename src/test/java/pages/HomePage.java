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

    @FindBy (xpath = "//li[@class='sn_menu_item ']/a")
        public WebElement createNewEmailLink;

    public String getLabelUserEmail() {
        return labelUserEmail.getText();
    }
    @FindBy(xpath="//ul[@class='ho_menu ho_menu-account']//span[@class=\"icon-ho ho_settings ho_i_settings\"]")
    public WebElement iconSettings;

    @FindBy(xpath="//ul[@class='ho_popup_menu']//li[7]/a")
    public WebElement iconExit;

    @FindBy(xpath="//li[@class='current new']//ins")
    public WebElement lableEmailCount;
  /*  public void writeEmail(){
        createNewEmailLink.click()*/
    }

