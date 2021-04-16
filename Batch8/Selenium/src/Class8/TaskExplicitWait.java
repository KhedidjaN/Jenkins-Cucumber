package Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskExplicitWait {

   public static  String url=" http://syntaxtechs.com/selenium-practice/dynamic-elements-loading.php";

    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.navigate().to(url);
    WebElement startButton=driver.findElement(By.id("startButton"));
        startButton.click();

    WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(), 'Welcome')]")));


    WebElement welcome=driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
    String firstNameText=welcome.getText();
        System.out.println(firstNameText);

}
}
