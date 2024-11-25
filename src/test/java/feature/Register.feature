
Feature: Registration
  As a user
  I want to register to the application
  So that i can excess the application


  Scenario: Register with a valid credentials
    Given I am on the Web Application page
    When I click on the Sign in text
    When I enter email
    When I click on the create an account button
    When I select the radiobutton
    When I enter firstname
    When I enter lastname
    When I enter password
    When I select from the day dropdown
    When I select from the month dropdown
    When I select from the year dropdown
    When I click on the Register button
    Then I should be registered