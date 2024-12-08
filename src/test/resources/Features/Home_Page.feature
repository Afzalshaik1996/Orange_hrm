Feature: Navigate to HRM Application

  Scenario Outline: Open a OrangeHRM website
    Given User open a desire browser
    When Enter the "<url>" of a website
    Then User should be able to navigate the website successfully and verify the "<ExpectedTitle>"



    Examples:
      | url   |ExpectedTitle|
    |https://opensource-demo.orangehrmlive.com/web/index.php/auth/login|OrangeHRM|