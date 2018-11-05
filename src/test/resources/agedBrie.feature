Feature: AgedBrie Item
  # a conjured item quality decreases twice the normal rate

  Scenario: agedBrie item update
    Given I have a new inventory Aged Brie
    Then the quality of the agedBrie item is 0
    When I update the inventory Aged Brie
    Then the quality of the agedBrie item is 1