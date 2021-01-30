package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition extends CommonMethods {
    @Given("navigate to HRMS login Page")
    public void navigate_to_HRMS_login_Page() {
        setUp();

    }

    @When("enter valid  Admin credentials")
    public void enter_valid_Admin_credentials() {
        loginPage.login("Admin","Hum@nhrm123");
    }


    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginBtn();
    }

    @Then("verify dashboard is displayed")
    public void verify_dashboard_is_displayed() {
        Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed());
    }

}




