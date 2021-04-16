package Com.Syntaxclass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingAmazonDD {

        public static String url = " http://www.amazon";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement categoriesDD=driver.findElement(By.id("searchDropdownBox"));
            Select select=new Select(categoriesDD );

            List<WebElement> options= select.getOptions();

            for (WebElement option : options){
                String optionText=option.getText();
                System.out.println(optionText);
            }
            select.selectByValue("search");// something missing check in gitHUb
        }
    }
