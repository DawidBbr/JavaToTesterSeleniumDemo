package Selectors;

import enums.SelectorType;
import org.openqa.selenium.By;

public interface WebElementSelectorsFillInputAndClickOnElementPage {
    By provideWayToLocateSelector = By.xpath("//*[@class='provide-button box']");
    By selectorTypeFieldSelector = By.xpath("//*[@class='ng-tns-c70-23 p-dropdown-label p-inputtext p-placeholder ng-star-inserted']");
    By selectorValueFieldSelector = By.id("selector-value");

    default By getSelectSelectorTypeFromDropDownSelector(SelectorType selectorType) {
        return (By.xpath("//*[text()='" + selectorType.getValue() + "']"));
    }
}
