package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.SignInPage;
import pages.UserOwnPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;

public class US_001Steps {
    HomePage homePage=new HomePage();
    SignInPage signInPage=new SignInPage();
    UserOwnPage userOwnPage=new UserOwnPage();

    Actions actions=new Actions(Driver.getDriver());

//    @Given("user is on the home page")
//    public void userIsOnTheHomePage() {
//
//    }

    @And("user hover over on human avatar and clicks on login button in homepage")
    public void userHoverOverOnHumanAvatarAndClicksOnLoginButtonInHomepage() throws InterruptedException {
        actions.moveToElement(homePage.humanAvatar).perform();
        Thread.sleep(3000);
        homePage.humanAvatar.click();


    }

    @And("user sends username {string}")
    public void userSendsUsername(String arg0) {
    }

    @And("user sends password {string}")
    public void userSendsPassword(String arg0) {
    }

    @And("user clicks on the LOG IN button in loginpage")
    public void userClicksOnTheLOGINButtonInLoginpage() {
    }

    @Then("user verifies they logged in their own page")
    public void userVerifiesTheyLoggedInTheirOwnPage() {
    }

    @Then("close the application")
    public void closeTheApplication() {
    }


}
