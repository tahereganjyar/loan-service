Feature: view contract info
  Scenario: view a valid contract successfully
    Given user go to contract list pae
    When user select a contract with id 1
    Then user see a contract info successfully