package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.NewEmailForm;

public class MyOwnTest extends BaseTest {
    @Test
    public void writeAndSendEmail() {

        app.login.login(validUser.getLogin(), validUser.getPassword());
        Assert.assertEquals(app.home.getLabelUserEmail(), validUser.getEmail());
       app.home.createNewEmailLink.click();
       app.newEmailForm.writeNewEmail();
    }
}
