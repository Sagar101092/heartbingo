
Feature: Top menu tab functionality
 i want to verify bingo top men tab
  @smoke
  Scenario: User should navigate to Bingo page successfully
    Given  I m on homepage
    When   I click on Bingo link
    Then   I should navigate to Bingo page successfully

  @smoke
  Scenario: User should navigate to Slot page and click on Gold Blitz and verify that user is redirected to Gold Blitz page
    Given  I m on homepage
    When   I click on slot link
    Then   I should navigate to slot page successfully
    And    I click on  "Gold Blitz" slot
    Then   i should redirect to Gold Blitz page