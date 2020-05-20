package Tests;

import Pages.IPDLogInPage;
import Utils.ConfigReader;
import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase{
//WebDriver driver=Driver.getDriver();

    @Test
    public void testLogIn(){
        driver.get(ConfigReader.getProperty("url"));
        IPDLogInPage page = new IPDLogInPage();
        page.logIn(ConfigReader.getProperty("email"),ConfigReader.getProperty("password"));
        String expectedTitle="IPD.Core.App";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

}
