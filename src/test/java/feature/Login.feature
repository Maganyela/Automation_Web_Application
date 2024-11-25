Feature: Login Passed
  As a user
  I want to Login with to the application
  With Valid email and Valid Password

  @smoke
  Scenario: Login with a valid credentials
    Given I am on the Web Application page
    When I click on the Sign in text
    When I enter the email
    When I enter the password
    When I click on the Sign In button
    Then I should be logged in