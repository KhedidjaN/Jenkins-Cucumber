package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (name="uid")
    WebElement userName;
    @FindBy (name="password")
    WebElement password;

    @FindBy (name="btnLogin")
    WebElement login;

     public void SetUserName(String uname){
         userName.sendKeys(uname);

     }

    public void setPassword(String pwd) {
       password.sendKeys(pwd);
    }
    public void clickSubmit(){
         login.click();

    }

}
