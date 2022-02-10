package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjects extends BasePage {

    private final WebDriverWait wait;

    public PageObjects(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//*[@id='block_top_menu']//*[text()='Women']")
    WebElement productFromWomenCategory;
    @FindBy(xpath = "//*[@class='search_query form-control ac_input']")
    WebElement inputValueInSearchingBox;
    @FindBy(xpath = "//*[@name='submit_search']")
    WebElement clickInSearchSignAfterInputValueInSearchBox;
    @FindBy(xpath = "//*[@class='login']")
    WebElement goToSignIn;

    public void clickOnWomenCategoryInHomePage() {
        wait.until(ExpectedConditions.visibilityOf(productFromWomenCategory));
        productFromWomenCategory.click();
    }
    public void inputValueAndClickToSearch(String keysToSend) {
        inputValueInSearchingBox.sendKeys(keysToSend);
        clickInSearchSignAfterInputValueInSearchBox.click();
    }
    public void clickOnSignInElementAndGoToTarget() {
        goToSignIn.click();
    }
}



