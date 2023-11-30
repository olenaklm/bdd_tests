#@NewMethod
Feature: Calculator

  Scenario Outline: Sum of the two numbers
    Given two numbers <a> and <b>
    When we try to find sum of our numbers
    Then result should be <result>
#    And check result

    Examples:
      | a | b | result  |
      | 3 | 2 | 5       |
      | 3 | 5 | 8       |