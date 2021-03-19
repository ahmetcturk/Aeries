#Author : Ahmets
Feature: Sauce Labs Login

  Scenario: Valid Login
    Given I am on the login page
    When I enter invalid username in the username field
    And I enter invalid password in the password field
    And I click on the login button
    Then I see the home page


  Scenario: Invalid login
    Given I am on the login page
    When I enter invalid username in the username field
    And I enter invalid password in the password field
    And I click on the login button
    Then I see the error message
# Check the feature, Pagemanager.initialize