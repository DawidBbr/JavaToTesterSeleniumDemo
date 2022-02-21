package tests;

import Pages.WomenCategoryPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    protected static final String BASE_URL = "http://automationpractice.pl/index.php";
    protected WebDriver driver;
    protected WomenCategoryPage womenCategoryPage;

    @BeforeEach
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        womenCategoryPage = new WomenCategoryPage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
