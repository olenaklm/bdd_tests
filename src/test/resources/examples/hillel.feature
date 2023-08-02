@Smoke
@IndefiniteStep
Feature: Search Hillel

  Scenario:Running a Full Text Quick Search
    Given I opened Google Page
    When I search the product "Hillel"
    And indefinite step
    Then the term query "Hillel" should be the first in the Search Result grid
