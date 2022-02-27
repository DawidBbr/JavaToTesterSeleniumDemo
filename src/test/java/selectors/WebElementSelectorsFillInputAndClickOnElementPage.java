package selectors;

import enums.SelectorType;
import org.openqa.selenium.By;

public interface WebElementSelectorsFillInputAndClickOnElementPage {
    By provideWayToLocateSelector = By.xpath("//*[@class='provide-button box']");
    By selectorTypeFieldSelector = By.xpath("//*[contains(text(),'Selector type')]");
    By selectorValueFieldSelector = By.id("selector-value");

    default By getSelectSelectorTypeFromDropDownSelector(SelectorType selectorType) {
        return (By.xpath("//*[text()='" + selectorType.getValue() + "']"));
    }
}
