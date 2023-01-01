Feature: Shopping
  @s1_sanity
  Scenario: Give correct change
    Given the following groceries:
      | name  | price |
      | milk  | 9     |
      | bread | 7     |
      | soap  | 5     |
    When I pay 25
    Then my change should be 4

  @s1_regression
  Scenario: Give correct change regression
    Given the following groceries:
      | name  | price |
      | milk  | 10    |
      | bread | 10    |
      | soap  | 10    |
    When I pay 31
    Then my change should be 1
