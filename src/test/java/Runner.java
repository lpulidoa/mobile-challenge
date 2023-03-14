import org.testng.annotations.Test;
import pages.ArticlePage;
import pages.LandingPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
public class Runner extends Hooks{

    @Test
    public void searchTest(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.searchQuery("Colombia")
                .waitForSearchResults();

        ArticlePage articlePage = landingPage.clickFirstResult();

        assertThat("The title was not correct",
                articlePage.getTitle(), equalTo("Colombia"));
    }

}
