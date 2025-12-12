package hooks;

import io.cucumber.java.Before;

public class WebDriverHooks {
    
    @Before
    public void setupWebDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    }
}