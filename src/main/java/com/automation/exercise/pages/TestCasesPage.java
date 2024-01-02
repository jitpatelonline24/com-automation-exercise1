package com.automation.exercise.pages;

import com.automation.exercise.ulility.Utility;
import org.openqa.selenium.By;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestCasesPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public String getCurrentURL(){
        waitUntilVisibilityOfElementLocated(By.xpath("//b[normalize-space()='Test Cases']"),5);
        log.info("Getting Home Page URL:  ");
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }
}
