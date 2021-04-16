package Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class ExplicitWaitDemo {
    public static String url="http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php";

    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to(url);
        WebElement getNewUserButton=driver.findElement(By.id("save"));
        getNewUserButton.click();

        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[contains(text(), 'First Name :')]")));


        WebElement firstName=driver.findElement(By.xpath("//p[contains(text(), 'First Name :')]"));
        String firstNameText=firstName.getText();
        System.out.println(firstNameText);

    }
}

