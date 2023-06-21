package com.heartbingo.pages;

import com.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SlotPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Online Slots']")
    WebElement onlineSlot;

    @CacheLookup
    @FindBy(xpath = "(//*[@class='casino-games__list-item games_list_component']//h2[normalize-space()='Top Slots']//following::div[@class='bvs-carousel bvs-carousel--with-arrows bvs-carousel--with-large-arrows']//a)")
    List<WebElement> slotsName;

    @CacheLookup
    @FindBy(xpath = "(//a[@aria-label='Gold Blitz'])[1]")
    WebElement goldBliz;

    public SlotPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSlotPageTitle() {
        log.info("Get Slot Page Title");
        return getTextFromElement(onlineSlot);
    }

    public void clickOnGoldBlitz(String slotName) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Get All slot name And click on " + goldBliz);
        for (WebElement e : slotsName) {
            if (e.getText().equalsIgnoreCase(slotName)) {
                clickOnElement(goldBliz);
                break;
            }
        }
    }
}



