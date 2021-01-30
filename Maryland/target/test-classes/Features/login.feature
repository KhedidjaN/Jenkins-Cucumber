Feature:

  Scenario:
  Scenario: login with valid credentials
    Given navigate to HRMS login Page
    When enter valid  Admin credentials
    And click on login button
    Then verify dashboard is displayed