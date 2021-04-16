package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    public WebElement usernameField=driver.findElement(By.id("txtUsername"));
    public WebElement passwordField=driver.findElement(By.id("p"));


}
