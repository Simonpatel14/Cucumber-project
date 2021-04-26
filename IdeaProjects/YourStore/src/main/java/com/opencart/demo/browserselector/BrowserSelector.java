package com.opencart.demo.browserselector;

import com.opencart.demo.basepage.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;


public class BrowserSelector extends BasePage {

      private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    public void selectBrowser(String browser){
        switch(browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                log.info("Launching Chrome Browser");
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                log.info("Launching FireFox Browser");
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                driver.manage().window().maximize();
                log.info("Launching Opera Browser");
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                driver.manage().window().maximize();
                log.info("Launching IE Browser");
                break;


            default:
                System.out.println("Unexpected value: " + browser);
                log.info("Incorrect Browser Selected");
        }

    }



}
