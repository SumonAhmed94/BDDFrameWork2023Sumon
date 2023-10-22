
@common
Feature: Valid Login Test

  @sprint1 @smoke @regression 
  Scenario: As a tester I open facebook app to
    enter my valid user name and password and click login button 
    so that i can be logged in

    Given I open facebook app
    When enter my valid user name and password
    And click login button
    Then i can be logged in
