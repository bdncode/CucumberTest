Feature: Check if number is multiple of

  Scenario: Check if a number is only multiple of 3
    Given Create the testing object
    When Set the number 3 as variable
    Then The result "is multiple of 3"

  Scenario: Check if a number is only multiple of 5
    Given Create the testing object
    When Set the number 5 as variable
    Then The result "is multiple of 5"

  Scenario: Check if a number is multiple of both 3 and 5
    Given Create the testing object
    When Set the number 15 as variable
    Then The result "is multiple of 3 and 5"