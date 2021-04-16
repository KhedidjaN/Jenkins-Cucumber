package testcases;


import org.junit.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
    @Test
    public void loginTest(){
        driver.get(baseUrl);
        logger.info("URL is opened");

        LoginPage login=new LoginPage(driver);
        login.SetUserName(username);
        logger.info("Entered username");
        login.setPassword(password);
        logger.info("Entered password");
        login.clickSubmit();

        if(driver.getTitle().equals("GTPL Bank Manager HomePage")){
            Assert.assertTrue(true);
            logger.info("login test passed");
        }else {
            Assert.assertFalse(false);
            logger.info("Login test failed");
        }

    }
}
