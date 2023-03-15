package steps;

import helpers.DriverHelper;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.ArticlePage;
import pages.LandingPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static steps.BasePageSteps.driver;


public class ArticlePageSteps{

//    private WebDriver driver;
//    private DriverHelper driverHelper;
//    public ArticlePageSteps(DriverHelper driverHelper) {
//
//        this.driverHelper = driverHelper;
//
//    }

    @Then("the user should get the correct article page in the first result")
    public void theUserShouldGetTheCorrectArticlePageInTheFirstResult() {

        ArticlePage articlePage = new LandingPage(driver).clickFirstResult();

        assertThat("The title was not correct",
                articlePage.getTitle(), equalTo("Endava"));
    }

}
