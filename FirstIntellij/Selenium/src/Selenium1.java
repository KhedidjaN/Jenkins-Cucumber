import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com/");
    }
}
