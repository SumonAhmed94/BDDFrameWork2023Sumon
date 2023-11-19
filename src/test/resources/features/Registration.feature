@Registration
Feature: Registration Test

  Scenario Outline: As a tester I open facebook application to create new account
    enter my valid user firstname and lastname
    Enter valid emailid and confirm email
    create valid password
    enter valid dateofbirth
    enter gender 
    click signup button
    so that i can be created an account

    Given Open <browser> and put <url>
    When Click on registration button
    And In put first Name <enterFirstName>
    And Input last Name <enterLastName>
    And Input email <enterEmail>
    And Input re enter email <enterconfirmEmail>
    And Input password <enterYourPassword>
    And Input birth Month <enterYourBirthMonth>
    And Input birth Day <enterYourBirthDay>
    And Input birth Year <enterYourBirthYear>
    And Input gender <enterYourgender>
    And click login button
    Then I can create an account

    Examples: 
      | browser   | url                         | enterFirstName | enterLastName | enterEmail        | enterconfirmEmail | enterYourPassword | enterYourBirthMonth | enterYourBirthDay | enterYourBirthYear | enterYourgender |
      | "chrome"  | "https://www.facebook.com/" | "Sumon1"       | "Ahmed1"      | "sumon@gmail.com" | "sumon@gmail.com" | "sumon12311"      | "Dec"               | "19"              | "1994"             | "Male"          |
      | "Firefox" | "https://www.facebook.com/" | "Ayra"         | "Ahmed"       | "sumon@gmail.com" | "sumon@gmail.com" | "sumon1231"       | "Jan"               | "25"              | "1984"             | "Female"        |
      | "edge"    | "https://www.facebook.com/" | "Tanita"       | "Hassan"      | "sumon@gmail.com" | "sumon@gmail.com" | "sumon1231"       | "Feb"               | "1"               | "1991"             | "Female"        |
