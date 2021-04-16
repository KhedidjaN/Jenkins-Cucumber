package ReviewClass;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.io.File;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

        public void testGuru99TakeScreenShot() throws Exception{

            WebDriver driver ;
            System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("http://demo.guru99.com/V4/");

            this.takeSnapShot(driver, "c://test.png") ;

        }


        public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{

            //Convert web driver object to TakeScreenshot

            TakesScreenshot scrShot =((TakesScreenshot)driver);

            //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file
            // }

    }






    }
}
