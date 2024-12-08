Feature: Login to Orange HRM Application

  Background:
    Given User opens the desired browser
    And User navigates to the OrangeHRM_URL


  @ValidCredentials
  Scenario Outline: Login with valid credentials
    Given User enters username as "<username>"
    And User enters password as "<password>"
    When User clicks the login button
    Then User should be logged in successfully

    Examples:
      | username   | password   |
      | Admin      | admin123  |


  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    Given User enters username as "<username1>"
    And User enters password as "<password1>"
    When User clicks the login button
    Then User should see an error message "<ErrorMessage>"

    Examples:
      | username1   | password1   | ErrorMessage              |
      | admin$$      | wrongPass  |Invalid credentials|






