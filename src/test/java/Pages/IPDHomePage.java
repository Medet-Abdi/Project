package Pages;

import Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class IPDHomePage {
    public IPDHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
