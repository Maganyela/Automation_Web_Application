Feature: Reset Password
  As a user
  I want to Reset password to the application
  ith the email i used when i register


  Scenario: Reset password with the valid email
    Given I am on the Web Application page
    When I click on the Sign in text
    When I click the forgot password hyperlink
    When I enter the valid email address
    When I click the Recover button
    Then It shows message of successfully sent