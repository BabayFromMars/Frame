package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AfterSendingPage extends BasePage {
    @FindBy(xpath="//ul[@class='ho_menu ho_menu-account']//span[@class=\"icon-ho ho_settings ho_i_settings\"]")
    private WebElement iconSettings;

    @FindBy(xpath="//ul[@class='ho_popup_menu']//li[7]/a")
    private WebElement iconExit;
}
