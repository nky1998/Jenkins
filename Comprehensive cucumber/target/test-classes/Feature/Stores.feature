Feature: Open the application for stores

Scenario: Opening Stores page and printing text present on the page
Given Initialize the driver with firefox browser for stores
When User clicks on stores button
Then print text present on the page 