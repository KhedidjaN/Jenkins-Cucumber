@featureTag @login #feature level tag
Feature: Login Functionality

  @validCred #scenario level tag
  Scenario: login with valid credentials
   # Given navigate to HRMS login Page
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    # And quit the browser

    @smoke @syntax @regression @whatever # adding multiple scenario level tags
    Scenario: Login with invalid credentials
     # Given navigate to HRMS login Page
      When enter invalid credentials
      And click on login button
      Then verify error message
      # And quit the browser
