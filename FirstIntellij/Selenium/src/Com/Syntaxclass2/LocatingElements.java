package Com.Syntaxclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {



        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.id("email")).sendKeys("syntax");
            driver.findElement(By.id("pass")).sendKeys("syntax123");
            driver.findElement(By.name("login")).click();
            Thread.sleep(2000);
            //driver.findElement(By.linkText("forgot password?")).click();
            driver.findElement(By.partialLinkText("Forgot")).click();
            Thread.sleep(2000);
            driver.quit();

}
}