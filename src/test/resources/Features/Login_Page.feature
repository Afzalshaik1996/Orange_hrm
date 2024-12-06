Feature: Login to Orange HRM Application

  Background:
    Given User opens the desired browser
    And User navigates to the OrangeHRM_URL


  @ValidCredentials
  Scenario Outline: Login with valid credentials
    Given User enters username as "<Username>"
    And User enters password as "<Password>"
    When User clicks the login button
    Then User should be logged in successfully

    Examples:
      | Username   | Password   |
      | Admin      | admin123  |


  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    Given User enters username as "<Username1>"
    And User enters password as "<Password1>"
    When User clicks the login button
    Then User should see an error message "<ErrorMessage>"

    Examples:
      | Username1   | Password1   | ErrorMessage              |
      | admin$$      | wrongPass  |Invalid credentials|






