package utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCreators {

    public static final WebDriverCreator FIREFOX_GECKO = new WebDriverCreator() {
        public WebDriver create() {
            startGeckoDriverServer();
            WebDriver driver = new FirefoxDriver();
            return driver;
        }
    };

    private static void startGeckoDriverServer() {
        System.setProperty("webdriver.firefox.marionette", GeckoDriverExecutor.getProperDriverExecutable());
    }

}
