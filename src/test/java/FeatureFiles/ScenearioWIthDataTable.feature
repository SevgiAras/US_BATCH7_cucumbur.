Feature: Scenario Outline with Data Table

  Scenario Outline: Scenario 1
    Given Step One
    |Step1|<Round Value1>|
    When  Step two
    Then  Step three
    |Step3|<Round Value2>|
    Then  Step four

    Examples:
      | Round Value1    | Round Value2   |
      | Round 1 Value1  | Round 1 Value2 |
      | Round 2 Value1  | Round 2 Value2 |
      | Round 3 Value1  | Round 3 Value2 |
      | Round 4 Value1  | Round 4 Value2 |

