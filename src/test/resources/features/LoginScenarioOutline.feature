@ScenarioOutline @common
Feature: Login feature with outline
  I want to use this template for my feature file

  Scenario Outline: Login test with user input
    As a user open facebook app to
    enter valid user name and password and click login button for multiple users
    so that user can be logged in with credentials

    Given user enter <browser> and <url> to open application
    When user enter <userName> and <password> on the input field
    And user click on loginButton
    Then user close the application

    Examples: 
      | browser | url                      | userName | password |
      | "Chrome"  | "https://www.facebook.com" | "sumon"    | "nurul1"    |
      | "Edge"    | "https://www.facebook.com" | "Eidita"  | "nurul2"    |
