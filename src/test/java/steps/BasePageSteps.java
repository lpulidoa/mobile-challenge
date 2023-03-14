//package steps;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BasePageSteps {
//
//    public static WebDriver driver = new ChromeDriver();
//
//    @Before
//    public void setUp(){
//        driver.manage()
//                .window()
//                .maximize();
//        driver.navigate()
//                .to("https://www.wikipedia.org/");
//    }
//
//    @After
//    public void tearDown(){
//        driver.quit();
//    }
//}
