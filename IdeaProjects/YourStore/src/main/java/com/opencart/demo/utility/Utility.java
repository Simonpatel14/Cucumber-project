package com.opencart.demo.utility;

import com.opencart.demo.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BasePage {
    /*
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    /*
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /*
     * This method will send text to an element
     */
    public void sendTextToElement(By by, String string) {
        driver.findElement(by).sendKeys(string);
    }

    /*
     * This method will send text to an element
     */
    public void sendTextToElement(WebElement element, String string) {
        element.sendKeys(string);
    }

    /*
     * This method will get text from an element
     * @return type method
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /*
     * This method will get text from an element
     * @return type method
     */
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by INDEX
     */
    public void selectByIndexFromDropDown(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by INDEX
     */
    public void selectByIndexFromDropDown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VISIBLE TEXT
     */
    public void selectByVisibleTextFromDropDown(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VISIBLE TEXT
     */
    public void selectByVisibleTextFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByVisibleText(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VALUE
     */
    public void selectByValueFromDropDown(By by, String string) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(string);
    }

    /*
     * This method wiLL SELECT an element from a DROPDOWN menu by VALUE
     */
    public void selectByValueFromDropDown(WebElement element, String string) {
        Select select = new Select(element);
        select.selectByValue(string);
    }

    /*
     * This method will verify that an element is displayed
     * @return type method
     */
    public boolean elementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is displayed
     * @return type method
     */
    public boolean elementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


    /*
     * This method will verify that an element is selected
     * @return type method
     */
    public boolean elementIsSelected(By by) {
        WebElement element = driver.findElement(by);
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is selected
     * @return type method
     */
    public boolean elementIsSelected(WebElement element) {
        if (element.isSelected()) {
            return true;
        } else {
            return false;
        }
    }


    /*
     * This method will verify that an element is enabled
     * @return type method
     */
    public boolean elementIsEnabled(By by) {
        WebElement element = driver.findElement(by);
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that an element is enabled
     * @return type method
     */
    public boolean elementIsEnabled(WebElement element) {
        if (element.isEnabled()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that element is displayed
     * @return type method
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify that element is displayed
     * @return type method
     */
    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * This method will verify Text using Assert.assertEquals function
     */
    public void verifyTextAssertEqualsMethod(By by, String str) {
        String actualText = driver.findElement(by).getText();
        String expectedText = str;
        Assert.assertEquals(expectedText,actualText);
    }

    /*
     * This method will verify Text using Assert.assertEquals function
     */
    public void verifyTextAssertEqualsMethod(WebElement element, String str) {
        String actualText = element.getText();
        String expectedText = str;
        Assert.assertEquals(expectedText,actualText);
    }

    /*
     * This method will verify Text using Assert.assertTrue and contains function
     */
    public void verifyTextAssertTrueContainsMethod(By by, String str) {
        String actualText = driver.findElement(by).getText();
        String expectedText = str;
        Assert.assertTrue(str, actualText.contains(expectedText));
    }

    /*
     * This method will verify Text using Assert.assertTrue and contains function
     */
    public void verifyTextAssertTrueContainsMethod(WebElement element, String str) {
        String actualText = element.getText();
        String expectedText = str;
        Assert.assertTrue(str, actualText.contains(expectedText));
    }



}
