package tests;

import com.it.App;
import com.it.utils.User;
import com.it.utils.UserFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
   protected static App app = new App();
protected static User validUser = UserFactory.getValidUser();
    protected static User validUser2 = UserFactory.getValidUser();
    @BeforeSuite
    public void setUp() {
        app.common.open();
    }

    @AfterSuite
    public void tearDown() {
        app.common.close();
    }



}
