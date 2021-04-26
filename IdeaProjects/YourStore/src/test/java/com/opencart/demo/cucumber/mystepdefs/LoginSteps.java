package com.opencart.demo.cucumber.mystepdefs;

import com.cucumber.listener.Reporter;
import com.opencart.demo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    @Given("^User is on Home page$")
    public void userIsOnHomePage() {

        Reporter.addStepLog("user is On Home Page " + "https://demo.opencart.com/");
    }


    @Then("^User should see message \"([^\"]*)\" on the home page$")
    public void userShouldSeeMessageOnTheHomePage(String msg)  {

        new LoginPage().verifyMessageOnHomePage(msg);

    }

    @When("^User clicks on My Account link$")
    public void userClicksOnMyAccountLink() {
        new LoginPage().userClicksOnMyAccountLink();

    }


    @And("^User clicks on Login Link$")
    public void userClicksOnLoginLink() {
        new LoginPage().userClicksOnLoginLink();
    }

    @Then("^User should navigate to Login link$")
    public void userShouldNavigateToLoginLink() {
    }

    @And("^User should see message on Login page display \"([^\"]*)\"$")
    public void userShouldSeeMessageOnLoginPageDisplay(String textLogin)  {
        new LoginPage().verifyMessageOnLoginPage(textLogin);

    }
}
