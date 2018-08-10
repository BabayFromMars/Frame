package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewEmailForm;

public class MyOwnTest extends BaseTest {
    @Test
    public void writeAndSendEmail() throws InterruptedException {
        app.login.login(validUser2.getLogin(), validUser2.getPassword());
        Assert.assertEquals(app.home.getLabelUserEmail(), validUser2.getEmail());
        String was = app.home.lableEmailCount.getText();
        app.home.iconSettings.click();
        Thread.sleep(1000);
        app.home.iconExit.click();

        app.login.login(validUser.getLogin(), validUser.getPassword());
        Assert.assertEquals(app.home.getLabelUserEmail(), validUser.getEmail());
       app.home.createNewEmailLink.click();
       app.newEmailForm.writeNewEmail();
        app.home.iconSettings.click();
        Thread.sleep(1000);
        app.home.iconExit.click();

        app.login.login(validUser2.getLogin(), validUser2.getPassword());
        Assert.assertEquals(app.home.getLabelUserEmail(), validUser2.getEmail());
        String now = app.home.lableEmailCount.getText();
        Assert.assertEquals(was, now);
    }
}
