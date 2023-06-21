package com.heartbingo.pages;

import com.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Bingo']")
    WebElement bingoButton;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Slots']")
    WebElement slotButton;
    @CacheLookup
    @FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
    WebElement acceptCookiesButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public void acceptCookies() {
        if (acceptCookiesButton.isDisplayed()) {
            clickOnElement(acceptCookiesButton);
        }
    }

    public void clickOnBingoTab() {
        log.info("Click on Bingo tab in TopMenu");
        clickOnElement(bingoButton);
    }

    public void clickOnSlotTab() {
        log.info("Click on Slot tab in TopMenu ");
        clickOnElement(slotButton);
    }

}
