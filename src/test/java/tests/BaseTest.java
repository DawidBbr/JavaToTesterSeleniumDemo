package tests;

import pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Interactions;

public class BaseTest {
    protected static final String BASE_URL = "https://app.drapla.com/login";
    protected WebDriver driver;
    protected Interactions interactions;
    protected LoginPage loginPage;
    protected TestCasePage testCasePage;
    protected ActionsPage actionsPage;
    protected AssertionsPage assertionsPage;
    protected NavigateToUrlActionPage navigateToUrlActionPage;
    protected ClickOnElementActionPage clickOnElementActionPage;
    protected FillInputActionPage fillInputActionPage;
    protected ManualActivityActionPage manualActivityActionPage;
    protected AssertionActionPage assertionActionPage;

    @BeforeEach
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        interactions = new Interactions(driver);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        loginPage = new LoginPage(interactions);
        actionsPage = new ActionsPage(interactions);
        navigateToUrlActionPage = new NavigateToUrlActionPage(interactions);
        assertionsPage = new AssertionsPage(interactions);
        clickOnElementActionPage = new ClickOnElementActionPage(interactions);
        fillInputActionPage = new FillInputActionPage(interactions);
        manualActivityActionPage = new ManualActivityActionPage(interactions);
        assertionActionPage = new AssertionActionPage(interactions);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
