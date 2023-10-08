Feature: Calculator operations

  Scenario: Addition
    Given I have numbers 5.0 and 3.0
    When I add them
    Then the result should be 8.0
