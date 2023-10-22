  @sprint2 @common
Feature: Login test with user input
  As a tester I open facebook app to
    enter my valid user name and password and click login button 
    so that i can be logged in with my credentials

  Scenario: Login Test With user input
    Given user open "Chrome" and "https://www.facebook.com"
    When user enter username "sumon"
    And user enter password "nurul"
    And user click on login button
    Then user logged in facebook

    
  Scenario: Login Test With user input
    Given user open "Firefox" and "https://www.facebook.com"
    When user enter username "tanita"
    And user enter password "nurul"
    And user click on login button
    Then user logged in facebook
    
    
  Scenario: Login Test With user input
    Given user open "Edge" and "https://www.facebook.com"
    When user enter username "Eidita"
    And user enter password "nurul"
    And user click on login button
    Then user logged in facebook