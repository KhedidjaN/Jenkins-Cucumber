package Com.Syntaxclass6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask {
    /*
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
        driver.switchTo().frame("FrameOne");
        WebElement frameHeader=driver.findElement(By.xpath("//a[text()='SYNTAX TECHNOLOGIES ']"));
        boolean isHeadDisplayed=frameHeader.isDisplayed();
        System.out.println("is Header displayed"+ isHeadDisplayed);

        driver.switchTo().defaultContent();

        WebElement secondFrame=driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
        driver.switchTo().frame(secondFrame);
        Thread.sleep(1000);

        WebElement enrollTodayButton=driver.findElement(By.xpath("//a[text(0='Enroll Today ']"));
        boolean isEnrollTodayEnabled=enrollTodayButton.isEnabled();
        System.out.println("is Enroll today enabled"+ isEnrollTodayEnabled);

    }
}
