package Pages;

import Selectors.WebElementSelectorsPage;
import org.openqa.selenium.WebDriver;

import static utils.Interactions.*;

public class WomenCategoryPage extends BasePage implements WebElementSelectorsPage {

    public WomenCategoryPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnWomenButton() {
        click(driver, womenButtonSelector);
    }

    public void clickOnDressesCategoryCheckBox() {
        click(driver, dressesCategoryCheckBoxSelector);
    }

    public void clickOnMediumSizeCheckBox() {
        click(driver, mediumSizeCheckBoxSelector);
    }

    public void clickOnOrangeColorCategory() {
        click(driver, orangeColorCategorySelector);
    }

    public void clickAndMoveSliderOfPriceProducts() {
        moveSliderFromOnePlaceToDestination(driver, sliderHandleSelector);

    }

    public void clickInSortByElementAndClickInSuggestedOptionFromDropDown() {
        clickAfterClick(driver, sortProductsBySelector, lowestFirstElementFromDropDownOfSortProductsBySelector);
    }

    public void clickInTheCheapestProductFromSearchResults() {
        click(driver, cheapestFilteredProductFromSearchResultsSelector);
    }

    public void clickInPlusToAddOneMoreDressToYourShopping() {
        click(driver, addOneMoreProductSelector);
    }

    public void clickInSizeBoxOfProductAndChooseSizeM() {
        clickAfterClick(driver, sizeBoxOfProductSelector, mediumSizeOfProductFromDropDownSizeSelector);
    }

    public void clickOnPhotoOfProductAfterCloseEnlargedPhoto() {
        clickAfterClick(driver, photoOfProductSelector, closeTheEnlargedPhotoOfProductSelector);
        isElementDisplayed(driver, photoOfProductSelector);
    }

    public void clickOnAddToCartButtonAndBackToShopping() {
        clickAfterClick(driver, addProductToCartSelector, continueShoppingAfterBuyProductSelector);
    }

    public void clickOnButtonCheckOutMyShoppingFromDropDrownCartProduct() {
        hoverOverAndClickOnDropDownElement(driver, viewMyShoppingCartSelector, buttonCheckOutMyShoppingSelector);
    }
}

