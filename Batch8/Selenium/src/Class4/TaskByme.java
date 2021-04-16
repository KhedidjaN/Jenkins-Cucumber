package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskByme {
    public static String url = "http://18.232.148.34/humanresources/symfony/web/index.php/auth/login";
    public static void main(String[] args) {

    /*
    Task
Open chrome browser
Go to “http://18.232.148.34/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify Syntax Logo is displayed.

     */
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.name("Submit")).click();


    }
}
