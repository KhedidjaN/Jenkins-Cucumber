package Com.Syntaxclass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TaskDonebyKhedidja {
    /*
    TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */

    public static String url = " http://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDD = driver.findElement(By.id("month"));// locate the dropdown
        Select select = new Select(daysDD);
        boolean isMultiple = select.isMultiple();// boolean value
        System.out.println(isMultiple);

        if (isMultiple) {
            List<WebElement> options = select.getOptions();
            for (WebElement option : options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(1000);
            }
        }
    }
}
