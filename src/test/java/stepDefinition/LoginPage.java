package stepDefinition;

import io.cucumber.java.en.When;


import static pages.HomePage.benepiklogo;

import static pages.LoginPage.Bpluslogin;
import static pages.LoginPage.SubmitPhonenumber;


public class LoginPage {
    @When("User successfully enters phone number")
    public void user_successfully_enters_phone_number() throws InterruptedException {
        Bpluslogin();
        SubmitPhonenumber();
    }
}
