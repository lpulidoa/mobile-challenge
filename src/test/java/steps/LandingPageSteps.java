package steps;

import helpers.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;

import java.sql.Driver;


public class LandingPageSteps{

    private WebDriver driver;
    private DriverHelper driverHelper;
    public LandingPageSteps(DriverHelper driverHelper) {

        this.driverHelper = driverHelper;
        driver = driverHelper.getDriver();

    }

    LandingPage landingPage = new LandingPage(driverHelper.getDriver());

    @Given("the user wants to make a search")
    public void theUserWantsToMakeASearch() {
    }

    @When("the user searches for {string} in the page")
    public void theUserSearchesForInThePage(String query) {
        landingPage.searchQuery(query).waitForSearchResults();
    }
}
