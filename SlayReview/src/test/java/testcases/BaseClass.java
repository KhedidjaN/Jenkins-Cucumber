package testcases;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.ReadConfig;
import utilities.ReadConfig;

import java.util.logging.Logger;

public class BaseClass {
    ReadConfig readConfig=new ReadConfig();
    public String baseUrl=readConfig.getApplicationUrl();
    public String username=readConfig.getUsername();
    public String password=readConfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;

    @Parameters("browser")
    @BeforeClass
    public void setup(String browser)
    {
        System.setProperty("webdriver.chrome.driver",readConfig.getChromePath());

        driver=new ChromeDriver();
        logger=Logger.getLogger("ebanking");
        PropertyConfigurator.configure("log4j.properties");

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}