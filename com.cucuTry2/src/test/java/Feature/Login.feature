Feature: Test Login functionality
  I want to use this template for my feature file

  Scenario: varify login test with valid credentials
    Given user is on login page
    When User enter username and password
    And click on login button
    Then user should land on home page