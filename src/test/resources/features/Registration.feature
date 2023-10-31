
@Registration
Feature: Registration Test

  Scenario: As a tester I open facebook application to create new account
    enter my valid user firstname and lastname
    Enter valid emailid and confirm email
    create valid password
    enter valid dateofbirth
    enter gender 
    click signup button
    so that i can be created an account
    
    Given I want to create a facebook account
    When  click to create account button
    And enter my valid user firstname and lastname
    And create valid password
    And enter valid dateofbirth
    And enter gender
    And click signup button
    Then so that i can be created an account

