package com.heartbingo.steps;

import com.heartbingo.pages.BingoPage;
import com.heartbingo.pages.GoldBlitzPage;
import com.heartbingo.pages.HomePage;
import com.heartbingo.pages.SlotPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuSteps {
    @Given("^I m on homepage$")
    public void iMOnHomepage() {
        new HomePage().acceptCookies();
    }

    @When("^I click on Bingo link$")
    public void iClickOnBingoLink() {
        new HomePage().clickOnBingoTab();
    }

    @Then("^I should navigate to Bingo page successfully$")
    public void iShouldNavigateToBingoPageSuccessfully() {
        String expectedMessage = "All Rooms";
        String actualMessage = new BingoPage().getBingoPageTitle();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @When("^I click on slot link$")
    public void iClickOnSlotLink() {
        new HomePage().clickOnSlotTab();
    }

    @Then("^I should navigate to slot page successfully$")
    public void iShouldNavigateToSlotPageSuccessfully() {
        String expectedMessage = "Online Slots";
        String actualMessage = new SlotPage().getSlotPageTitle();
        Assert.assertEquals(actualMessage, expectedMessage);
    }


    @Then("^i should redirect to Gold Blitz page$")
    public void iShouldRedirectToGoldBlitzPage() throws InterruptedException {
        String expectedMessage = "Gold Blitz";
        String actualMessage = new GoldBlitzPage().goldBlitzPageTitle();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^I click on  \"([^\"]*)\" slot$")
    public void iClickOnSlot(String slotName) throws InterruptedException {
        new SlotPage().clickOnGoldBlitz(slotName);
    }
}
