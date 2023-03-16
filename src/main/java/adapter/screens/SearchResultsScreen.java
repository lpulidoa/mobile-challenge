package adapter.screens;

import adapter.bases.BaseMobileScreen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchResultsScreen extends BaseMobileScreen {
    public SearchResultsScreen(AndroidDriver driver) {
        super(driver);
    }
    private final String searchBarId = "com.imdb.mobile:id/search_src_text";
    private final String searchResultsId = "com.imdb.mobile:id/suggestion";
    private final String clearHistoryButtonId = "com.imdb.mobile:id/search_history_clear";

    public SearchResultsScreen waitForResults() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(locateElementUiSelector(clearHistoryButtonId))));
        return this;
    }

    public SearchResultsScreen searchMovie(String movieName) {
        locateElementUiSelector(searchBarId).sendKeys(movieName);
        return new SearchResultsScreen(driver);
    }

    public MovieScreen clickFirstResult() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitForElementClickable(searchResultsId);

        locateElementsUiSelector(searchResultsId).get(0).click();
        return new MovieScreen(driver);
    }
}
