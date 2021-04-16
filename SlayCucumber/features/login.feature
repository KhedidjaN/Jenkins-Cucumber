Feature: Login

  Scenario: Successful Login With Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And  User enters Email "admin@yourstore.com" and Password "admin"
    And click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on log out link
    Then  Page Title should be "Your store. Login"
    And close browser

  Scenario Outline: Login Data Driven
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And  User enters Email "<email>" and Password "<password>"
    And click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on log out link
    Then  Page Title should be "Your store. Login"
    And close browser
    Examples:

      | email | password  |
      | admin@yourstore.com | admin|
      | admin1@yourstore.com | admin123 |
