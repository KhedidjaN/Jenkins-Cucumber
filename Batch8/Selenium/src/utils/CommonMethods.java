package utils;
import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class CommonMethods {

    protected static WebDriver driver;

    /**
     * this method will open a browser, set up configuration and navigate to the URL
     */
    public static void setUp() {

        configsReader.readProperties("C:\\Users\\SARA\\IdeaProjects\\Batch8\\Selenium\\src\\utils\\configsReader.java");
        switch (configsReader.getPropertyValue("browser").toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Ivalid browser");
        }
        driver.get(configsReader.getPropertyValue("url"));
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /**
     * this method will close any open browser
     */
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
