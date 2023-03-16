package steps;

import adapter.screens.MovieScreen;
import adapter.screens.SearchResultsScreen;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static steps.BaseMobileTest.driver;

public class MovieSteps {
    @Then("the user should see the correct movie overview in the first result")
    public void theUserShouldSeeTheCorrectMovieOverviewInTheFirstResult() {
        MovieScreen movie = new SearchResultsScreen(driver).clickFirstResult();
        Assert.assertEquals(movie.getPlotOverview(),
                "A police officer joins a secret organization that polices and monitors extraterrestrial interactions on Earth.");
    }
}
