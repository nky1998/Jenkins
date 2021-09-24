Feature: Open the application for Sale

Scenario: Opening Sale tab and check for total items and sale
Given Initialize the driver with firefox browser for sale
When User clicks on sale button followed by all products
Then Check for all products available on sale and print its count 