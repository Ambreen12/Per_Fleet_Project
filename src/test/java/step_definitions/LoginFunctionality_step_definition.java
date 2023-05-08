package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Per_Fleet_LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LoginFunctionality_step_definition {
    Per_Fleet_LoginPage loginPage = new Per_Fleet_LoginPage();

    @Given("User is on the perfleet login page")
    public void user_is_on_the_perfleet_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters driver username")
    public void user_enters_driver_username() {
        loginPage.inputUsername.sendKeys("User1");
    }

    @When("user enters driver  password")
    public void user_enters_driver_password() {
        loginPage.inputUserPassword.sendKeys("UserUser123");
        loginPage.loginButton.click();

    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(loginPage.userNameDropDown));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertTrue(loginPage.userNameDropDown.getText().contains("John Doe"));

    }

    @When("user enters storemanager username")
    public void user_enters_storemanager_username() {
        loginPage.inputUsername.sendKeys("storemanager51");

    }

    @When("user enters storemanager  password")
    public void user_enters_storemanager_password() {
        loginPage.inputUserPassword.sendKeys("UserUser123");
        loginPage.loginButton.click();

    }

    @When("user enters salesmanager username")
    public void user_enters_salesmanager_username() {
        loginPage.inputUsername.sendKeys("salesmanager101");

    }

    @When("user enters salesmanager  password")
    public void user_enters_salesmanager_password() {
        loginPage.inputUserPassword.sendKeys("UserUser123");
        loginPage.loginButton.click();

    }

    @When("user enters driver  invalid username")
    public void user_enters_driver_invalid_username() {
        loginPage.inputUsername.sendKeys("ambreen12");

    }

    @When("user enters  correct driver  password")
    public void user_enters_correct_driver_password() {
        loginPage.inputUserPassword.sendKeys("UserUser123");
        loginPage.loginButton.click();

    }

    @Then("user should see the Invalid username or password message")
    public void user_should_see_the_invalid_username_or_password_message() {
        String expectedresult = "Invalid user name or password.";
        Assert.assertEquals(expectedresult, loginPage.errormessage.getText());


    }


    @When("user enters driver email {string}")
    public void userEntersDriverEmail(String arg0) {
        loginPage.inputUsername.sendKeys(arg0);
    }

    @And("user enters  drıver password {string}")
    public void userEntersDriverPassword(String arg0) {
        loginPage.inputUserPassword.sendKeys(arg0);
        loginPage.loginButton.click();
    }

    @Then("user should see this field required message")
    public void userShouldSeeThisFieldRequiredMessage() {
        if (loginPage.inputUsername.getAttribute("value").isEmpty()) {
            Assert.assertEquals("Please fill in this field.", loginPage.inputUsername.getAttribute("validationMessage"));

        }
        if (loginPage.inputUserPassword.getAttribute("value").isEmpty()) {
            Assert.assertEquals("Please fill in this field.", loginPage.inputUserPassword.getAttribute("validationMessage"));

        }
    }
}