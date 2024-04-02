@registration
Feature: User Registration
  As a new user
  I want to be able to register on the online shopping portal
  So that I can access the features and make purchases

  Scenario: Register with valid details
    Given I click on registration link
    When I fill in the registration form with valid details
    And I submit the registration form
    Then I should be registered successfully