Feature: Feature to test cookies dailog popup window fucntionality

  Scenario: Check login RR USER Successfully with vaild credenatils
    Given RR user is on login page
    When RR user enters username and password
    And Click on Login button
    Then Cookies dialog popup window appears on top of home page

  Scenario: Check cookies Dialog window appears first time after login
    Given RR user able see cookies Dialog window appears first time
    When RR user click on Accept button from popup window
    And Dialog window disapperas from main window
    Then cookies shall be stored in browser session history with id and code

  Scenario: Check cookies dialog window appears having two buttons Accept and Deny
    Given RRAD user able see cookies Dialog window appears on top of login screen
    When RRAD user find dialog window appear with two buttons
    And RRAD user verify the name of buttons
    Then Verify Both button must be clickable

  Scenario: Check Click on Accept button from cookies dialog window
    Given RRAB user able see cookies Dialog window appearsAB
    When RRAB user find dialog window appear with two buttons
    And RRAB user click the Accept button the dialog is disappear
    Then the cookies values is store browser cache history
