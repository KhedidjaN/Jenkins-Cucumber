package CLass9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class HandlingPagination extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
        setUp();
        WebElement username = driver.findElement(By.xpath("//input[@id = 'txtUsername']"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id = 'btnLogin']"));
        loginButton.click();

        WebElement PIM = driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        WebElement addEmployee = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployee.click();
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("zzzzzzz");
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("zzzzzzzzzzzz");

        WebElement empIdField = driver.findElement(By.id("employeeId"));
        String empId = empIdField.getAttribute("value");

        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();
        WebElement employeeListButton = driver.findElement(By.linkText("Employee List"));
        employeeListButton.click();
        List<WebElement> tableRows=driver.findElements(By.xpath(""));


    }
}
