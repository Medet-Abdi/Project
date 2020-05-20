package Pages;

import Utils.BrowserUtils;
import Utils.Driver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IPDLogInPage {

    WebDriver driver= Driver.getDriver();
    public IPDLogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//input[@class='MuiInputBase-input MuiInput-input']")
    public WebElement LogInBox;

    @FindBy(xpath="/html//div[@id='root']/div[@class='jss1']/div//form/label/span[1]//input[@value='true']")
    public WebElement RememberMeCheckBox;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/div/div[2]/div/form/div[2]/div/button")
    public WebElement LogInButton;

    @FindBy(xpath="//input[@class='MuiInputBase-input MuiInput-input']")
    public WebElement PasswordBox;

    @FindBy(xpath="//*[@id=\"root\"]/div/div/div/form/div[1]/div/button/span[1]/span")
    public WebElement PasswordVisibilityButton;

    @FindBy(xpath="//span[@class='MuiButton-label']")
    public WebElement LogInButtonPass;

    @FindBy(xpath="//input[@class='MuiInputBase-input MuiInput-input']")
    public WebElement KeyBox;
    @FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root jss214 MuiButton-contained jss215 MuiButton-containedSecondary jss217']")
    public WebElement AuthenticateButton;
    @FindBy(xpath="/html//div[@id='root']/div[@class='jss1']//label/span[1]//input[@value='false']")
    public WebElement CheckBox;
    @FindBy(xpath="//span[@class='MuiButton-label']")
    public WebElement AgreeButton;
    @FindBy(xpath="//*[@id=\"root\"]/div/header/div/div[4]/button")
    public WebElement AccountIcon;
    @FindBy(xpath="/html/body/div[2]/div[3]/ul/div[3]/li/a")
    public WebElement SignOutButton;
    @FindBy(xpath="/html/body/div[3]/div[3]/div/div[2]/div/div[1]/button")
    public WebElement SignOutButtonContinue;

    public void logIn(String email, String password){
        this.LogInBox.sendKeys(email);
        RememberMeCheckBox.click();
        LogInButton.click();
        String value = "Testpass@123";

        BrowserUtils.waitForVisibility(PasswordBox,30);
        PasswordBox.sendKeys("Testpass@123");
        LogInButtonPass.click();
        driver.navigate().refresh();
    }
}
