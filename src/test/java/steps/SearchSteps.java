package steps;

import adapter.screens.SearchScreen;
import io.cucumber.java.en.When;

import static steps.BaseMobileTest.driver;

public class SearchSteps {
//    AndroidDriver<AndroidElement> driver;
//    public SearchSteps(AndroidDriver<AndroidElement> driver) {
//        this.driver = driver;
//    }

    @When("the user searches for the movie {string}")
    public void theUserSearchesForTheMovie(String movieName) {
        SearchScreen searchScreen = new SearchScreen(driver);
        searchScreen.searchBarClick().searchMovie(movieName);
    }
}
