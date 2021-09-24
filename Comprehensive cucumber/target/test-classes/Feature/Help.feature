Feature: Open the application for help

Scenario: Opening Help page and cheecking for Help kyeword in the title of the page
Given Initialize the driver with firefox browser for help
When User clicks on help button
Then Check for Help keyword in the title 