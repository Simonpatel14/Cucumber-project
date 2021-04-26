package com.opencart.demo.cucumber;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        // with "pretty" scenario which is written in the feature file will print in the console with path
        plugin = {"pretty","html:target/cucumber-report/cucumber.html", "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html"},

        //with monochrome = true Scenario will come in white if pretty is written
        // if not return then it default value false & only 1 Scenarios (1 passed) 6 Steps (6 passed) will print and in the () comes in color
        // with preety whole scenario comes in color
        monochrome = true

)
public class CukeTest {
    @AfterClass
    public static void setUp(){
        String projectPath = System.getProperty("user.dir");

        String reportConfigPath = projectPath + "/src/test/resources/extentreport/extent-config.xml";
        Reporter.loadXMLConfig(reportConfigPath);
    }

}

