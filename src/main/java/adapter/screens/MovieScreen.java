package adapter.screens;

import adapter.bases.BaseMobileScreen;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class MovieScreen extends BaseMobileScreen {
    public MovieScreen(AndroidDriver driver) {
        super(driver);
    }

    private final String plotOverviewId = "com.imdb.mobile:id/plot_overview";

    public String getPlotOverview() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitForElementPresence(plotOverviewId);
        return locateElementUiSelector(plotOverviewId).getText();
    }

}
