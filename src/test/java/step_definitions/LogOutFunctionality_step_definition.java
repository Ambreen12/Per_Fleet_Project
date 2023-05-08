package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.Per_Fleet_HomePage;
import pages.Per_Fleet_LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LogOutFunctionality_step_definition {
    Per_Fleet_HomePage homePage = new Per_Fleet_HomePage();
    Per_Fleet_LoginPage loginPage= new Per_Fleet_LoginPage();


    @When("user will  click on his name")
    public void user_will_click_on_his_name() {
        homePage.userProfile.click();

    }
    @Then("user will click on logout button")
    public void user_will_click_on_logout_button() {
        homePage.logOutButton.click();
    }
    @Then("end up on the login page")
    public void end_up_on_the_login_page() {
        String expectedurl="https://qa.perfleet.com/user/login";
        Assert.assertEquals(expectedurl,Driver.getDriver().getCurrentUrl());

    }

    @When("user clicks on step back button")
    public void user_clicks_on_step_back_button() {
        Driver.getDriver().navigate().back();

    }
    @Then("user comes back on the login page not the home page")
    public void user_comes_back_on_the_login_page_not_the_home_page() {
        String expectedtitle= "https://qa.perfleet.com/user/login";
        Assert.assertEquals(expectedtitle, Driver.getDriver().getCurrentUrl());

    }

    @Then("User is on the perfleet homepage login page")
    public void userIsOnThePerfleetHomepageLoginPage() {
    }


}