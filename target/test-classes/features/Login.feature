#Author: your.email@your.domain.com
Feature: Login

  @tag1
  Scenario: As a tester I open facebook app to
    enter my valid user name and password and click login button 
    so that i can be logged in

    Given I open facebook app
    When enter my valid user name and password
    And click login button
    Then i can be logged in
