package slayReviews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {
    static String url="http://automationpractice.com/index.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //Xpath or  //tagname[@attribute='value' or @attribute='value']
         WebElement search=driver.findElement(By.xpath("//input[@class='search_query form-control ac_input'or @name='search_query']"));
       search.sendKeys("T-SHIRTS");
       //Xpath contains //tagname[contains(@attribute,'value');



    }

}
