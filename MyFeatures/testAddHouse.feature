
Feature: Testing add house

  Scenario: The owner adds a house
    Given The owner has entered the house information
    When add new house
    Then Add the house in the house array list of this owner
