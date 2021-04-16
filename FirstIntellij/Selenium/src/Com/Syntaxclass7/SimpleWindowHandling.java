package Com.Syntaxclass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SimpleWindowHandling {
            public static String url = " https://accounts.google.com/signup";
        // username : password@

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
           String mainPageHandle= driver.getWindowHandle();
            System.out.println(mainPageHandle);

            WebElement helpLink=driver.findElement(By.linkText("Help"));
            helpLink.click();

            Set<String> allWindowHandles=driver.getWindowHandles();
            System.out.println(allWindowHandles.size()
            );

    }
}
