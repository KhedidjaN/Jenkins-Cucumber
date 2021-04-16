import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {

    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\SARA\\IdeaProjects\\FirstIntellij\\class34\\src\\credentials";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        String name=(String) properties.get("username");
         String pass=(String) properties.get("password");


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
            WebDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.facebook.com");
        chromeDriver.findElement(By.id("email")).sendKeys(name);
        chromeDriver.findElement(By.id("pass")).sendKeys(pass);



    }

}