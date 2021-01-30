Feature:
  Scenario: Search for "Jennifer Lynn Lopez" by Id "2021"
    Given navigate to HRMS login Page
    When enter valid  Admin credentials
    And click on login button
    Then verify dashboard is displayed
    When click on PIM
    And enter Id of employee
    And click  on search
    Then click on employee on the table


