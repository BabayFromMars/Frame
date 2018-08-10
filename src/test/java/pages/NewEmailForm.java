package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEmailForm extends BasePage{

    @FindBy(xpath = "//span[@class='field']/textarea")
    public WebElement inputFieldTo;

    @FindBy(xpath = "//span[@class='field']/input")
    public WebElement inputFieldEmailSubject;

    @FindBy(xpath = "//div[@class='text_editor_browser']/textarea")
    public WebElement inputFieldEmailBody;

    @FindBy(xpath = "//p[@class='send_container clear']/input")
    public WebElement sendButton;

    public void writeNewEmail(){
        inputFieldTo.sendKeys("ittest@i.ua");
        inputFieldEmailSubject.sendKeys("test email");
        inputFieldEmailBody.sendKeys("My first attempt to create own test");
        sendButton.click();
    }

}
