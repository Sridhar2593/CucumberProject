Feature: This feature will help to do the calculator functionality

  Background: 
    Given The calculator application is open

  Scenario: Add two Numbers
    When I add two numbers "2" and "5"
    Then I should get the result as "7"

  Scenario: Multiply two Numbers
    When I multiply two numbers "3" and "5"
    Then I should get the result as "15"
