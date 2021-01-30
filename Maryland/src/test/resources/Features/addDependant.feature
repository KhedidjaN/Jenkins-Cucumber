Feature:
  Scenario: Add Dependants Employee
    Given navigate to HRMS login Page
    When enter valid  Admin credentials
    And click on login button
    Then verify dashboard is displayed
    When click on PIM
    And enter Id of employee
    And click  on search
    Then click on employee on the table
    When click on Dependants
    And click on Add Button
    And enter name of dependant "Emme Anthony"
    And enter relationship dependant's employee
     And enter Date of Birth
    And click on save button


