package steps;

import adapter.screens.LoginScreen;
import adapter.screens.MovieScreen;
import io.cucumber.java.en.Given;

import static steps.BaseMobileTest.driver;

public class LoginSteps {
    @Given("the user wants to make a search skipping login")
    public void theUserWantsToMakeASearchSkippingLogin() {
        LoginScreen loginScreen = new LoginScreen(driver);
        loginScreen.skipSignIn().goToSearch();
    }
}
