Feature: Sulfuras Item


  Scenario: sulfuras item update
    Given I have a new inventory sulfuras
    Then the quality of the sulfuras item is 80
    When I update the inventory sulfuras
    Then the quality of the sulfuras item is 80

