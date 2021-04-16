package Com.Syntaxclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/?tag=amazusnavi-20&hvadid=381823327678&hvpos=&hvnetw=g&hvrand=8148226523632011942&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9008190&hvtargid=kwd-10573980&ref=pd_sl_7j18redljs_e&hydadcr=28883_11845441&gclid=Cj0KCQiAh4j-BRCsARIsAGeV12DSHTkp57bEEOMWMU1PXqh6JIJxEKwc2_ZQrJVVx9FeiDi6uBVHtb8aAuh3EALw_wcB");
   String url=driver.getCurrentUrl();
   System.out.println(url);
   String title=driver.getTitle();
   System.out.println(title);
    }
}
