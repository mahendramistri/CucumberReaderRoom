Feature: Test Public Access functionality

Scenario: Check Public Access for Store cookies

Given chrome browser is open
And User is on RR Page
When User Click on Public access link button
And Cookie Dialog window open with two button
Then user clicked on Accept button to Stroe session