Feature: Basic Arithmetic

  Background: A Calculator
    Given a calculator I just turned on
  @newfeature
  Scenario: Addition
  # Try to change one of the values below to provoke a failure
    When I add 4 and 5
    Then the result is 9

  @sanity
  Scenario: Another Addition
  # Try to change one of the values below to provoke a failure
    When I add 4 and 7
    Then the result is 11

  @sanity
  Scenario: Another Addition 6
  # Try to change one of the values below to provoke a failure
    When I add 4 and 7
    Then the result is 11

  @sanity
  Scenario: Another Addition 2
  # Try to change one of the values below to provoke a failure
    When I add 4 and 7
    Then the result is 11

  @sanity
  Scenario: Another Addition 3
  # Try to change one of the values below to provoke a failure
    When I add 4 and 7
    Then the result is 11

  @sanity
  Scenario: Another Addition 4
  # Try to change one of the values below to provoke a failure
    When I add 4 and 7
    Then the result is 11

  @sanity
  Scenario: Another Addition 5
  # Try to change one of the values below to provoke a failure
    When I add 4 and 7
    Then the result is 11

  @regression
  Scenario Outline: Many additions
    Given the previous entries:
      | first | second | operation |
      | 1     | 1      | +         |
      | 2     | 1      | +         |
    When I press +
    And I add <a> and <b>
    And I press +
    Then the result is <c>

    Examples: Single digits
      | a | b | c  |
      | 1 | 2 | 8  |
      | 2 | 3 | 10 |

    Examples: Double digits
      | a  | b  | c  |
      | 10 | 20 | 35 |
      | 20 | 30 | 55 |
