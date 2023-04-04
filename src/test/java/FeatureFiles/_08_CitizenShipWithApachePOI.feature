Feature: CitizenShip with ApachePOI

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on login Button
    Then User should login successfully
    Given Navigate to CitizenShips page


  Scenario: Create new citizenship

    Then Create a citizenship by Apache POI


