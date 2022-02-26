package tests;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.FillInput;

public class BaseTest {
    protected static final String BASE_URL = "https://app.drapla.com/login";
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ActionsPage actionsPage;
    protected AssertionsPage assertionsPage;
    protected NavigateToUrlActionPage navigateToUrlActionPage;
    protected ClickOnElementActionPage clickOnElementActionPage;
    protected FillInputActionPage fillInputActionPage;
    protected ManualActivityActionPage manualActivityActionPage;

    @BeforeEach
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        actionsPage = new ActionsPage(driver);
        assertionsPage = new AssertionsPage(driver);
        navigateToUrlActionPage = new NavigateToUrlActionPage(driver);
        clickOnElementActionPage = new ClickOnElementActionPage(driver);
        fillInputActionPage = new FillInputActionPage(driver);
        manualActivityActionPage = new ManualActivityActionPage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
