
Feature: Place Order functionality in Demoblaze

  Scenario: User places an order successfully

    Given user launches the demoblaze website
    And user logs in with valid credentials
    And user selects a product and adds to cart
    And user navigates to cart page
    When user clicks on Place Order
    And user fills the order form details
    And user clicks on Purchase button
    Then order should be placed successfully