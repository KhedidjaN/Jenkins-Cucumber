package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage extends CommonMethods {
    @FindBy(linkText = "Dependents")
    public WebElement dependent;
    @FindBy(id = "btnAddDependent")
    public WebElement addButton;
    @FindBy(id = "dependent_name")
    public WebElement dependantName;

    @FindBy(id = "dependent_relationshipType")
    public WebElement relationshipDD;

    @FindBy(id = "dependent_dateOfBirth")
    public WebElement dateOfBirth;


  @FindBy(id = "btnSaveDependent")
  public WebElement saveDependent;

  public void clickOnSaveDependent(){
      click(saveDependent);
  }




    public void clickOnDependent(){
        click(dependent);
    }
    public void clickOnAddButton(){
        jsClick(addButton);
    }
    public void dependantName(String name){
        sendText(dependantName,name );
    }
    public void clickOnDateOfBirth(String string){
        click(dateOfBirth);
        sendText(dateOfBirth, string);
    }
    public PersonalDetailsPage(){
        PageFactory.initElements(driver, this);
    }
}
