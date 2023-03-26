Feature: CitizenShip Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on login Button
    Then User should login successfully
     When Navigate to CitizenShips page


    Scenario Outline: Create a citizenShip
      Then Click on add button
      Then Enter CitizenShip name as "<CitizenShipName>" and citizenShip short name as "<CitizenShipShortName>"
      When  Click on save button
      Then Success message should be displayed

      Examples:
      |CitizenShipName  |CitizenShipShortName|
      |Srt231           |s1                   |
      |Sty21          |s2                   |

      Scenario Outline: Delete  citizenship
        And search  for citizenShip with name  as "<CitizenShipName>" and short name as "<CitizenShipShortName>"
        And Delete citizenship
        Then Success message should be displayed
        Examples:
          |CitizenShipName  |CitizenShipShortName|
          |Srt231             |s1                   |
          |Sty21             |s2                   |

