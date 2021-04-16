Feature: Configuration PIM - Optional Fields

  Scenario: Unchecking unnecessary checkboxes
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    When click on PIM
    When click on configuration dropdown
    And click on optional fields
    Then click on edit button
    And uncheck unnecessary checboxes
    | Show SSN field in Personal Details|
    | Show SIN field in Personal Details                        |