package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends CommonMethods{
    @FindBy(id = "welcome")
    public WebElement welcomeMessage;

    @FindBy(linkText = "PIM")
    public WebElement PIMButton;

    @FindBy(id="empsearch_id")
    public WebElement employeeID;

    @FindBy(id="searchBtn")
    public WebElement searchButton;
    @FindBy(linkText = "2021")
    public WebElement empIdClick;

    public void clickOnPIM() {
        jsClick(PIMButton);
    }
 public void setEmployeeID(String emID){
        sendText(employeeID,emID );
 }
 public void setSearchButton() {
     jsClick(searchButton);
 }
 public void setEmpIdClick(){
        jsClick(empIdClick);
 }

    public DashboardPage() {
        PageFactory.initElements(CommonMethods.driver, this);
    }
}


