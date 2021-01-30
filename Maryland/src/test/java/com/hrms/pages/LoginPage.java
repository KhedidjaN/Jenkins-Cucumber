package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.hrms.utils.CommonMethods.sendText;

public class LoginPage extends CommonMethods {
   @FindBy(id = "txtUsername")
    public WebElement AdminnameBox;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement AdminpasswordBox;

    @FindBy(css = "input#btnLogin")
    public WebElement loginBtn;

    @FindBy(id="spanMessage")
    public WebElement errorMsg;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password){
        sendText(AdminnameBox,username);
        sendText(AdminpasswordBox, password);

    }
    public void clickOnLoginBtn(){
        click(loginBtn);
    }


}

