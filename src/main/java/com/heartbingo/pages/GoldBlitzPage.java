package com.heartbingo.pages;

import com.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBlitzPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Gold Blitz']")
    WebElement goldBlitzText;

    public GoldBlitzPage() {
        PageFactory.initElements(driver, this);
    }

    public String goldBlitzPageTitle() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get Gold Blitz Page Title");
        return getTextFromElement(goldBlitzText);
    }

}
