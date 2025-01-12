Feature: view contract info

  Scenario Outline: view a valid contract successfully
    Given user go to contract list pae
    When user sum <number1> and <number2>
    Then user see <result> successfully

    Examples:
      | number1 | number2 | result |
      | 1       | 2       | 3      |
      | 1       | 3       | 9      |

