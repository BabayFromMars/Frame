package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

 //   WebDriver driver;

/*    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }*/

    @FindBy(xpath = "//input[@name='login']")
	private WebElement inputLogin;

	@FindBy(xpath="//input[@name='pass']")
	private WebElement inputPassword;

	@FindBy(xpath="//form[@name='lform']//input[@type='submit']")
	private WebElement btnSubmit;

    public void login(String login, String password){
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        btnSubmit.click();
    }

}
