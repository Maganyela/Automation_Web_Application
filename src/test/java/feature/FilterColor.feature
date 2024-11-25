Feature: Filter Products with different color
  As a user
  I want to filter color of the products


  Scenario: filter product on the application
    Given I am on the dress web page
    When I click the White color checkbox
    When I click the Black color checkbox
    Then I should be able to see the product colors