Feature: Fee Functionality


  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on login Button
    Then User should login successfully

  Scenario: Create A Fee
    Given Navigate to Fee Page
    And Click on add button
    And Fill the add fee form
    |Batch 1 fee|
    |b1|
    |bt1|
    |5670|
    When Click on save button
    Then Success message should be displayed

    Scenario: Delete Fee
      Given Search for the Fee
        |Batch 1 fee|
        |b1|
        |bt1|
      When Delete on Fee
      Then Success message should be displayed



