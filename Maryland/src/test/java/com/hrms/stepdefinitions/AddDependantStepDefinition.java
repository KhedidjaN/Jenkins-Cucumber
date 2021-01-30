package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDependantStepDefinition extends CommonMethods {
    @When("click on Dependants")
    public void click_on_Dependants() {
       personalDetailsPage.clickOnDependent();
    }
    @When("click on Add Button")
    public void click_on_Add_Button() {

        personalDetailsPage.clickOnAddButton();
    }

    @When("enter name of dependant {string}")
    public void enter_name_of_dependant(String string) {
        personalDetailsPage.dependantName("Emme Anthony");
    }
    @When("enter relationship dependant's employee")
    public void enter_relationship_dependant_s_employee() {
        selectDDValue(personalDetailsPage.relationshipDD, "Child");
    }
    @When("enter Date of Birth")
    public void enter_Date_of_Birth() {
        personalDetailsPage.clickOnDateOfBirth("2008-02-22");


    }


    @When("click on save button")
    public void click_on_save_button() {
       personalDetailsPage.clickOnSaveDependent();
    }



    @Then("verify all dependants are added")
    public void verify_all_dependants_are_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
