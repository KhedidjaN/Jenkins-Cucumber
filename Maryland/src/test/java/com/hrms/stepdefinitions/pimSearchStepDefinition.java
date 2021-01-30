package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class pimSearchStepDefinition extends CommonMethods {
    @When("click on PIM")
    public void click_on_PIM() {
        dashboardPage.clickOnPIM();
    }


    @When("enter Id of employee")
    public void enter_Id_of_employee() {
       dashboardPage.setEmployeeID("2021");

    }



    @When("click  on search")
    public void click_on_search() {
  dashboardPage.setSearchButton();
    }


    @Then("click on employee on the table")
    public void click_on_employee_on_the_table() {
        dashboardPage.setEmpIdClick();
    }


}
