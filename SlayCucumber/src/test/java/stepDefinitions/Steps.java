package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class Steps {
    public WebDriver driver;
    public LoginPage loginPage;
    @Given("User Launch Chrome browser")
    public void user_Launch_Chrome_browser(){
        System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
        driver=new ChromeDriver();
        loginPage= new LoginPage(driver);

    }
    @When("User opens URL {string}")
    public void user_opens_URL(String url){
        driver.get(url);
        driver.manage().window().maximize();

    }

    @When("User enters Email {string} and Password {string}")
    public void user_enters_Email_and_Password(String email, String password){
        loginPage.setEmail(email);
        loginPage.setPassword(password);

    }
    @When("click on Login")
    public void click_on_Login(){
        loginPage.setLoginButton();

            }

    @Then("Page Title should be {string}")
    public void Page_Title_should_be(String title){
        if (driver.getPageSource().contains("Login was unssuccessful.")){
            driver.close();
            Assert.assertTrue(false);
        }else {
            Assert.assertEquals(title, driver.getTitle());
        }
    }
    @When("User click on log out link")
    public void User_click_on_log_out_link() throws InterruptedException {
        loginPage.setLogOut();
        Thread.sleep(3000);
    }
    @Then("close browser")
    public void close_browser(){
        driver.quit();
    }



}
