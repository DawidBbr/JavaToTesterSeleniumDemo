package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;


public class BaseTest {
    protected static final String BASE_URL = "http://automationpractice.com/index.php";

    protected WebDriver driver;   // communication with the browser

    @BeforeAll  // run before all tests
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterEach    // run after each test
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
