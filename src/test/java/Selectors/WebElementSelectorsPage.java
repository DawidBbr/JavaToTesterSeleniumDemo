package Selectors;

import org.openqa.selenium.By;

public interface WebElementSelectorsPage {
    By womenButtonSelector = By.xpath("//*[@id='block_top_menu']//*[text()='Women']");
    By dressesCategoryCheckBoxSelector = By.xpath("//*[@id='uniform-layered_category_8']");
    By mediumSizeCheckBoxSelector = By.xpath("//*[@id='uniform-layered_id_attribute_group_2']");
    By orangeColorCategorySelector = By.xpath("//*[@id='layered_id_attribute_group_13']");
    By sliderHandleSelector = By.xpath("//*[@class='layered_slider_container']");
    By sortProductsBySelector = By.xpath("//*[@id='uniform-selectProductSort']");
    By lowestFirstElementFromDropDownOfSortProductsBySelector = By.xpath("//*[contains(text(),'Price: Lowest first')]");
    By cheapestFilteredProductFromSearchResultsSelector = By.xpath("//*[contains(text(),'Printed Dress')]");
    By addOneMoreProductSelector = By.xpath("//*[@class='btn btn-default button-plus product_quantity_up']");
    By sizeBoxOfProductSelector = By.id("uniform-group_1");
    By mediumSizeOfProductFromDropDownSizeSelector = By.xpath("//*[@id='group_1']//*[contains(text(),'M')]");
    By photoOfProductSelector = By.id("bigpic");
    By closeTheEnlargedPhotoOfProductSelector = By.xpath("//*[@class='fancybox-item fancybox-close']");
    By addProductToCartSelector = By.xpath("//*[contains(text(),'Add to cart')]");
    By continueShoppingAfterBuyProductSelector = By.xpath("//*[@class='icon-chevron-left left']");
    By viewMyShoppingCartSelector = By.xpath("//*[@title='View my shopping cart']");
    By buttonCheckOutMyShoppingSelector = By.xpath("//*[contains(text(),'Check out')]");
}
