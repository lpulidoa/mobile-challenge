package adapter.screens;

import adapter.bases.BaseMobileScreen;
import io.appium.java_client.android.AndroidDriver;

public class GlobalNavigationScreen extends BaseMobileScreen {

    public GlobalNavigationScreen(AndroidDriver driver){super(driver);}

    private final String searchButtonId = "com.imdb.mobile:id/navigation_search_browse";

    public SearchScreen goToSearch(){
        locateElementUiSelector(searchButtonId).click();
        return new SearchScreen(driver);
    }

}
