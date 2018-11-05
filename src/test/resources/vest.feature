Feature: Vest Item


  Scenario: vest item update
    Given I have a new inventory vest
    Then the quality of the vest item is 20
    When I update the inventory vest
    Then the quality of the vest item is 19
