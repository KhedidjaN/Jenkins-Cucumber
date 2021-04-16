package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     public WebDriver driver;

     public LoginPage(WebDriver driver){
         this.driver=driver;
         PageFactory.initElements(driver, this);
         }
     @FindBy(id="Email")
    WebElement email;

     @FindBy(id="Password")
     WebElement password;

     @FindBy(xpath = "//input[@value='Log in']")
     WebElement loginButton;

     @FindBy(linkText = "Logout")
     WebElement logOut;



    public void setEmail(String emaiLogin){
        email.clear();
         email.sendKeys(emaiLogin);
     }

     public void setPassword  (String psswrd){
        password.clear();
        password.sendKeys(psswrd);
     }
     public void setLoginButton(){
        loginButton.click();
     }
     public void setLogOut(){
        logOut.click();
     }
}
