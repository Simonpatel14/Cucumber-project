package com.opencart.demo.pages;

import com.cucumber.listener.Reporter;
import com.opencart.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {



    @FindBy(linkText = "Your Store")
    WebElement _txt_homePage;

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement _link_myAccount;

    @FindBy(linkText = "Login")
    WebElement _link_logIn;

    @FindBy(xpath = "//h2[text()='Returning Customer']")
    WebElement _txt_loginPage;

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public void verifyMessageOnHomePage(String msg){
        verifyTextAssertEqualsMethod(_txt_homePage,msg);
        Reporter.addStepLog("verifyMessageOnHomePage" + _txt_homePage);
        log.info("verifyMessageOnHomePage " + _txt_homePage );

    }

    public void userClicksOnMyAccountLink (){
        clickOnElement(_link_myAccount);
        Reporter.addStepLog("User clicks on MyAccount Link " + _link_myAccount);
        log.info("User clicks on Login Link " + _link_myAccount);
    }

    public void userClicksOnLoginLink(){

        clickOnElement(_link_logIn);
        Reporter.addStepLog(" User Clicks On LoginLink" + _link_logIn);
        log.info(" User Clicks On LoginLink" + _link_logIn);
    }

    public void verifyMessageOnLoginPage(String textLogin) {
        verifyTextAssertEqualsMethod(_txt_loginPage,textLogin);
        Reporter.addStepLog("verify Message On loginPage " + _txt_loginPage);
        log.info("verify Message On loginPage " + _txt_loginPage);
    }
}
