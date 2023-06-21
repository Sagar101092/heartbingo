package com.heartbingo.pages;

import com.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BingoPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Rooms']")
    WebElement allRooms;


    public BingoPage() {
        PageFactory.initElements(driver, this);
    }

    public String getBingoPageTitle() {
        log.info("Get Bingo Page Title");
        return getTextFromElement(allRooms);
    }

}
