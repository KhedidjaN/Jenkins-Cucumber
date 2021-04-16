import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
class PageF{
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","drivers89//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.getTitle();
        System.out.println(driver.getTitle());



    }

}