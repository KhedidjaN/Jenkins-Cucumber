package Com.Syntaxclass6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*
    Task
Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
verify the header text Syntax Technologies -......
verify enroll today button is enabled
     */
    public static String url = " http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
