Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on login Button
    Then User should login successfully
    And Navigate to Country page


  Scenario: Create Country
#    Given Navigate to Campus
#    When Enter username and password
#    And Click on login Button
#    Then User should login successfully
#    And Navigate to Country page
    When Create a new country
    Then Success message should be displayed


    Scenario: Delete Country
#      Given Navigate to Campus
#      When Enter username and password
#      And Click on login Button
#      Then User should login successfully
#      And Navigate to Country page
      When Delete country
      Then Success message should be displayed

      Scenario:
#        Given Navigate to Campus
#        When Enter username and password
#        And Click on login Button
#        Then User should login successfully
#        And Navigate to Country page
        And Click on add button
        When Enter country name as "S1" and code as "11"
        And Click on save button
        Then Success message should be displayed

  Scenario: Delete Country
#      Given Navigate to Campus
#      When Enter username and password
#      And Click on login Button
#      Then User should login successfully
#      And Navigate to Country page
    When Delete country
    Then Success message should be displayed

