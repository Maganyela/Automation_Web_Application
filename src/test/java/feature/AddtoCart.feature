Feature: Add different product to the cart
  As a user
  I want to add the selected product in to the cart



  Scenario: Add product on the application
    Given I am on the Dress color page
    When I click the White color
    When I click the Add to cart button
    When I click the Proceed to cashOut button
    Then The product should be in the cart ready for cashOut