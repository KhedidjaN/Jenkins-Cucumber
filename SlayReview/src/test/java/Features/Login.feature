Feature: OrgangeHRM Login

    Scenario: logo presence on OrangeHRM home page
      Given I launch chrome browser
      When I can log in OrangeHRM homepage
      Then I verify if the logo is displayed on the page
      And close browser
