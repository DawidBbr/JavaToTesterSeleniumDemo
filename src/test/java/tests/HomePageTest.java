package tests;

import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

        @Test
        public void checkCanIBuyDress() {
            womenCategoryPage.clickOnWomenButton();
            womenCategoryPage.clickInSortByElementAndClickInSuggestedOptionFromDropDown();
            womenCategoryPage.clickOnDressesCategoryCheckBox();
            womenCategoryPage.clickOnMediumSizeCheckBox();
            womenCategoryPage.clickOnOrangeColorCategory();
//            womenCategoryPage.clickAndMoveSliderOfPriceProducts();
            womenCategoryPage.clickInTheCheapestProductFromSearchResults();
            womenCategoryPage.clickInPlusToAddOneMoreDressToYourShopping();
            womenCategoryPage.clickOnPhotoOfProductAfterCloseEnlargedPhoto();
            womenCategoryPage.clickInSizeBoxOfProductAndChooseSizeM();
            womenCategoryPage.clickOnAddToCartButtonAndBackToShopping();
            womenCategoryPage.clickOnButtonCheckOutMyShoppingFromDropDrownCartProduct();
        }
    }
