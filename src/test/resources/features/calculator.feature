Feature: Calculator operations

  Scenario: Addition
    Given I have numbers 5.0 and 3.0
    When I add them
    Then the result should be 8.0

  Scenario: Subtraction
    Given I have numbers 5.0 and 3.0
    When I subtract them
    Then the result should be 2.0

  Scenario: Multiplication
    Given I have numbers 5.0 and 3.0
    When I multiply them
    Then the result should be 15.0

  Scenario: Division
    Given I have numbers 6.0 and 3.0
    When I divide them
    Then the result should be 2.0
