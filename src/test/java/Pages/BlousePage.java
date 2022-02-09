package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class BlousePage extends BasePage {

    private final WebDriverWait wait;

    public BlousePage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//*[@class='product-container']")
    List<WebElement> allDataAboutSearchingBlouse;
    @FindBy(xpath = "//*[@class='right-block']//*[@title='Blouse']")
    WebElement titleOfProduct;
    @FindBy(xpath = "//*[@class='right-block']//*[contains(text(),'$27.00')]")
    WebElement priceOfProduct;
    @FindBy(xpath ="//*[@class='top-pagination-content clearfix']//*[contains(text(),'1 of 1')]")
    WebElement findOneElementEqualsToInputValueInSearchBox;

    public void shouldReturnValidDataAboutBlouseAfterSearching() {
        List<String> infoAboutBlouse = allDataAboutSearchingBlouse.stream()
                .map(e -> e.getText().trim().toLowerCase())
                .filter(e -> e.contains("b"))
                .collect(Collectors.toList());
        for (String allInfo : infoAboutBlouse) {
            System.out.println(allInfo);
        }
    }

    public boolean shouldReturnCorrectTitleOfProduct() {
        return shouldReturnCorrectDataOfProduct(titleOfProduct);
    }
    public boolean shouldReturnCorrectPriceOfProduct() {
        return shouldReturnCorrectDataOfProduct(priceOfProduct);
    }
    public boolean shouldReturnOneElementAfterSearching() {
        return shouldReturnCorrectDataOfProduct(findOneElementEqualsToInputValueInSearchBox);
    }

    public boolean shouldReturnCorrectDataOfProduct(WebElement box) {
        wait.until(ExpectedConditions.visibilityOf(box));
        boolean isDisplayed = false;
        try {
            isDisplayed = box.isDisplayed();
        } catch (NoSuchElementException e) {
        }
        return isDisplayed;
    }
}
