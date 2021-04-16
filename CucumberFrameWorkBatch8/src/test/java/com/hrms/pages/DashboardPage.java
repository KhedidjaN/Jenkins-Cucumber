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

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeBtn;

    @FindBy (id = "menu_pim_viewEmployeeList")
    public WebElement employeeList;

    public void clickOnPIM(){
        jsClick(PIMButton);
    }
    public void clickOnAddEmployeeBtn(){
        jsClick(addEmployeeBtn);
    }


    public DashboardPage() {
        PageFactory.initElements(CommonMethods.driver, this);
    }
}
