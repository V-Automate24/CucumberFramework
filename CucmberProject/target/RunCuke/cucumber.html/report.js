$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test1.feature");
formatter.feature({
  "line": 2,
  "name": "This modle is to test the Google Module.",
  "description": "",
  "id": "this-modle-is-to-test-the-google-module.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GoogleSearchModle"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "this-modle-is-to-test-the-google-module.;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Search-Youtubelink"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the Home Page \"https://erail.in/\" of Erail Website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I move to PNR Status page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "validate PNR staus page title",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter the PNR number and click on status button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should see PNR status for the passenger",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://erail.in/",
      "offset": 23
    }
  ],
  "location": "Test1.i_am_on_the_Home_Page_of_Erail_Website(String)"
});
formatter.result({
  "duration": 18737892069,
  "status": "passed"
});
formatter.match({
  "location": "Test1.i_move_to_PNR_Status_page()"
});
formatter.result({
  "duration": 1102828740,
  "status": "passed"
});
formatter.match({
  "location": "Test1.validate_PNR_staus_page_title()"
});
formatter.result({
  "duration": 44320908,
  "status": "passed"
});
formatter.match({
  "location": "Test1.enter_the_PNR_number_and_click_on_status_button()"
});
formatter.result({
  "duration": 2149471504,
  "status": "passed"
});
formatter.match({
  "location": "Test1.i_should_see_PNR_status_for_the_passenger()"
});
formatter.result({
  "duration": 7851803503,
  "status": "passed"
});
formatter.after({
  "duration": 383291,
  "status": "passed"
});
});