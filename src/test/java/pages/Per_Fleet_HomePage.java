package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Per_Fleet_HomePage {
    public Per_Fleet_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement userProfile;

    @FindBy(xpath = "//a[@class='no-hash']")
    public WebElement logOutButton;
}
