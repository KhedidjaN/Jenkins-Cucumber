package Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooHM {
    public static String url="https://login.yahoo.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to(url);
       WebElement username=driver.findElement(By.id("login-username"));
               username.sendKeys("testnaveen@yahoo.com");
       WebElement nextButton= driver.findElement(By.name("signin"));
          nextButton.click();
       WebElement passWord=driver.findElement(By.id("password-container"));
          passWord.sendKeys("");
    }
}
