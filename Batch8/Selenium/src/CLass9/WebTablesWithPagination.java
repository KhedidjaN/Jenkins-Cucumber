package CLass9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesWithPagination {
    public static String url="http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        List<WebElement> tableRows=driver.findElements(By.xpath("//table[@class='table table-hover']"));

    }
}
