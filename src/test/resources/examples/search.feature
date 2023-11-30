@great
Feature: Search product

  Scenario:Running a Full Text Quick Search
    Given I opened Google Page
    When I search the product "Dell"
    Then the term query "Dell" should be the first in the Search Result grid

  Scenario Outline: Running a Full Text Quick Search
    Given I opened Google Page Second
    When I search the product "<request>"
    Then the term query "<request>" should be the first in the Search Result grid

    Examples:
      | request |
      | Nokia   |
      | Xiaomi  |