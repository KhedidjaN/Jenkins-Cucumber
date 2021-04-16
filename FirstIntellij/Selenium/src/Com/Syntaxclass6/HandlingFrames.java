package Com.Syntaxclass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
    public static String url = " http://www.uitestpractice.com/Students/Switchto";
    // username : password@

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.id("name"));
        textBox.sendKeys(" 2020 sucks!!!");
        driver.switchTo().defaultContent(); // switching the focus back to the main page
       // WebElement alertButton=driver.findElement(By.id("alert"));
        //alertButton.click();

        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys(" sdssdsdsd");

        driver.switchTo().defaultContent();

        WebElement frameElement= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(frameElement); //Webelement
        textBox.clear();
        textBox.sendKeys("Get coffee before class!!! Not during");

    }
}
