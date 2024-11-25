Feature: CashOut the product that is in the cart
  As a user
  I want to CashOut the selected product in to the cart

  Scenario: Place order on the application
    Given I am on the Cash out page
    When I click the Add to cart buttons
    When I click the Proceed to cashOut Initially
    When I click on the Proceed to cashOut on Summary stage
    When I click the proceed to cashOut on Address stage
    When I click the proceed to cashOut on Shipping stage
    When I click on the Cash by check on Payment stage
    When I click on the confirm my order button
    When I click on the view order history button
    When I click on the back to you account button
    Then I should navigate to the home page and verify home logo