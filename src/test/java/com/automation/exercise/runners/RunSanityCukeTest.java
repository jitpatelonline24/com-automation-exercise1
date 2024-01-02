package com.automation.exercise.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "src/test/resources/features",    // content path of features folder
            glue =  "com/automation/exercise/steps" ,     // sources path from steps folder
            plugin = {"html:target/cucumber-reports/cucumber.html",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                    "json:target/cucumber-reports/cucumber.json"},
            tags = "@sanity"

    )
    public class RunSanityCukeTest extends AbstractTestNGCucumberTests {
    }

