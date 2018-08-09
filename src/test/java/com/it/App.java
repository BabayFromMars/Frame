package com.it;

import pages.NewEmailForm;
import steps.CommonSteps;
import steps.HomeSteps;
import steps.LoginSteps;
import steps.NewEmailFormSteps;

public class App {
    public CommonSteps common;
    public LoginSteps login;
    public HomeSteps home;
    public NewEmailForm newEmailForm;

    public App() {
        common = new CommonSteps();
        login = new LoginSteps();
        home = new HomeSteps();
        newEmailForm = new NewEmailFormSteps();
    }
}
