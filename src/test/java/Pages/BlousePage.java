package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BlousePage extends BasePage {

    private final WebDriverWait wait;
    private WebDriver driver;

    public BlousePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean ifTitleOfDisplayedProductIsCorrect(String titleOfProduct) {
        return isWebElementDisplayed(driver.findElement(titleOfSearchedProduct(titleOfProduct)));
    }
    public By titleOfSearchedProduct(String title) {
        return (By.xpath("//*[@class='right-block']//*[@title='" + title + "']"));
    }

    public boolean ifPriceOfDisplayedProductIsCorrect(String productPrice) {
        return isWebElementDisplayed(driver.findElement(priceOfSearchedProduct(productPrice)));
    }
    public By priceOfSearchedProduct(String price) {
        return (By.xpath("//*[@class='right-block']//*[contains(text(),'" + price + "')]"));
    }

    public boolean ifOneElementIsDisplayedAfterSearching(String numberOfSearchResults) {
        return isWebElementDisplayed(driver.findElement(findOneElementEqualsToInputValueInSearchBox(numberOfSearchResults)));
    }
    public By findOneElementEqualsToInputValueInSearchBox(String oneElement) {
        return (By.xpath("//*[@class='top-pagination-content clearfix']//*[contains(text(),'" + oneElement + "')]"));
    }

    public boolean isWebElementDisplayed(WebElement box) {
        wait.until(ExpectedConditions.visibilityOf(box));
        boolean isDisplayed = false;
        try {
            isDisplayed = box.isDisplayed();
        } catch (NoSuchElementException e) {
        }
        return isDisplayed;
    }
}
