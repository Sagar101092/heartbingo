$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("topmenu.feature");
formatter.feature({
  "line": 2,
  "name": "Top menu tab functionality",
  "description": "i want to verify bingo top men tab",
  "id": "top-menu-tab-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6200154300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should navigate to Bingo page successfully",
  "description": "",
  "id": "top-menu-tab-functionality;user-should-navigate-to-bingo-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I m on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Bingo link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to Bingo page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iMOnHomepage()"
});
formatter.result({
  "duration": 303603900,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iClickOnBingoLink()"
});
formatter.result({
  "duration": 580068500,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldNavigateToBingoPageSuccessfully()"
});
formatter.result({
  "duration": 370975400,
  "status": "passed"
});
formatter.after({
  "duration": 576387200,
  "status": "passed"
});
formatter.before({
  "duration": 5359542800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User should navigate to Slot page and click on Gold Blitz and verify that user is redirected to Gold Blitz page",
  "description": "",
  "id": "top-menu-tab-functionality;user-should-navigate-to-slot-page-and-click-on-gold-blitz-and-verify-that-user-is-redirected-to-gold-blitz-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I m on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on slot link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I should navigate to slot page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click on  \"Gold Blitz\" slot",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "i should redirect to Gold Blitz page",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuSteps.iMOnHomepage()"
});
formatter.result({
  "duration": 127704000,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iClickOnSlotLink()"
});
formatter.result({
  "duration": 467486400,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldNavigateToSlotPageSuccessfully()"
});
formatter.result({
  "duration": 2029461300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gold Blitz",
      "offset": 13
    }
  ],
  "location": "TopMenuSteps.iClickOnSlot(String)"
});
formatter.result({
  "duration": 1577367500,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldRedirectToGoldBlitzPage()"
});
formatter.result({
  "duration": 1034716300,
  "status": "passed"
});
formatter.after({
  "duration": 594679000,
  "status": "passed"
});
});