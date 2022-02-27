package selectors;

import enums.AssertionType;
import enums.SelectorType;
import org.openqa.selenium.By;

public interface WebElementSelectorsAssertionPage {
    By assertionTypeFieldSelector = By.xpath("//*[contains(text(),'Assertion type')]");
    By provideWayToLocateSelector = By.xpath("//*[@class='provide-button box']");
    By selectorTypeFieldSelector = By.xpath("//*[contains(text(),'Selector type')]");
    By selectorValueFieldSelector = By.id("selector-value");

    default By getAssertionTypeFromDropDownSelector(AssertionType assertionType) {
        return (By.xpath("//*[contains(text(),'" + assertionType.getValue() + "')]"));
    }
    default By getSelectSelectorTypeFromDropDownSelector(SelectorType selectorType) {
        return (By.xpath("//*[text()='" + selectorType.getValue() + "']"));
    }
}
