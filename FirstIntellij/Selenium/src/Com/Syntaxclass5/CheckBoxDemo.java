package Com.Syntaxclass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
    public static String url = "http://syntaxtechs.com/selenium-practice/basic-checkbox-demo.php ";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> optionCheckBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int optionsCount = optionCheckBoxes.size();
        System.out.println(optionsCount);
        for (WebElement checkBoxoption : optionCheckBoxes) {
            if (checkBoxoption.isEnabled()) {
                String checkBox = checkBoxoption.getAttribute("Value");
                if (checkBox.equalsIgnoreCase("Option-2")) {
                    checkBoxoption.click();
                    Thread.sleep(100);
                    break;
                }
            }
        }
    }
}