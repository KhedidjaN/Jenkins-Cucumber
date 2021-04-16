package Com.Syntaxclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDoneByMe {
    public static void main(String[] args) throws InterruptedException {


     /*
    Task
   Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
   Login
   Get title and verify
   logout
   close the browser
     */
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("This is the right title");
        } else {
            System.out.println("This is not the right title");
        }
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
