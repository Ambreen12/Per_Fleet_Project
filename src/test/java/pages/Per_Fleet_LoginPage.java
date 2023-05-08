package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class Per_Fleet_LoginPage {

  public  Per_Fleet_LoginPage() {

    PageFactory.initElements(Driver.getDriver(), this
    );
  }
@FindBy (xpath ="//input[@id='prependedInput']")
    public WebElement inputUsername;

  @FindBy (xpath = "//input[@id='prependedInput2']")
    public WebElement inputUserPassword;

  @FindBy (xpath = "//button[@id='_submit']")
  public WebElement loginButton;

  @FindBy(xpath = "//div[.='Invalid user name or password.']")
  public  WebElement errormessage;

  @FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
  public  WebElement userNameDropDown;



}
