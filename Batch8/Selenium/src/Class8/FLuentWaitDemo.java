package Class8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FLuentWaitDemo {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver);

    }
}