package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;
    @Given("I launch chrome browser")
    public void i_launce_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","drivers89//chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

    }

    @When("I can log in OrangeHRM homepage")
    public void i_can_log_in_OrangeHRM_homepage() throws InterruptedException {
        WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("admin123");
        WebElement loginBttn=driver.findElement(By.id("btnLogin"));
        loginBttn.click();
        Thread.sleep(4000);
    }

    @Then("I verify if the logo is displayed on the page")
    public void i_verify_if_the_logo_is_displayed_on_the_page() {
        boolean status=driver.findElement(By.xpath("//div[@id='divLogo']")).isDisplayed();
        Assert.assertEquals(true, status);
    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }




}
