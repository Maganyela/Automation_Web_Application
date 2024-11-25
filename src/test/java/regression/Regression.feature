Feature: Regression Master
  As a user
  I want to perform Regression on the application

  @regression
  Scenario: User Registration
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


  @regression
  Scenario: Password Recovery
    Given I am on the Web Application page
    When I click on the Sign in text
    When I click the forgot password hyperlink
    When I enter the valid email address
    When I click the Recover button
    Then It shows message of successfully sent


  @regression
  Scenario: Login with a valid credentials
    Given I am on the Web Application page
    When I click on the Sign in text
    When I enter the email
    When I enter the password
    When I click on the Sign In button
    Then I should be logged in

  @regression
  Scenario: Search product on the application
    Given I am on the Search Page
    When I search any product on the search bar
    When I click on the search button
    Then the user should see the text that is used to search

  @regression
  Scenario: Select Categories on the application
    Given I am on the Select Category page
    When I click on the Dresses button
    When I click on Casual dress checkbox
    When I click on Evening dress checkbox
    When I click on Summer dress checkbox
    Then I should be able to see the different product

  @regression
  Scenario: filter product on the application
    Given I am on the dress web page
    When I click the White color checkbox
    When I click the Black color checkbox
    Then I should be able to see the product colors

  @regression
  Scenario: Add product on the application
    Given I am on the Dress color page
    When I click the White color
    When I click the Add to cart button
    When I click the Proceed to cashOut button
    Then The product should be in the cart ready for cashOut

  @regression
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