package Com.Syntaxclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.facebook.com/EnglishAnti/?modal=admin_todo_tour");
        driver.navigate().back();

        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.close();
    }
}
