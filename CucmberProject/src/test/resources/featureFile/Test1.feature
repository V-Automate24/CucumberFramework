@GoogleSearchModle
Feature: This modle is to test the Google Module.


@Search-Youtubelink 
Scenario: Validate Search Cars Page 
	Given I am on the Home Page "https://erail.in/" of Erail Website 
	When I move to PNR Status page 
	And validate PNR staus page title
	And Enter the PNR number and click on status button 
	Then I should see PNR status for the passenger