package steps;

import common.Constants;
import pages.BasePage;

public class CommonSteps extends BasePage {

    public void open() {
        driver.get(Constants.BASE_URL);
    }

    public void close() {
        driver.quit();
    }
}
