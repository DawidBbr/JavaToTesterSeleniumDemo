package pages;

import selectors.WebElementSelectorsFillInputAndClickOnElementPage;
import selectors.WebElementSelectorsPage;
import enums.ActionType;
import enums.SelectorType;
import org.openqa.selenium.WebDriver;
import utils.ClickOnElement;

import static utils.Interactions.*;

public class ClickOnElementActionPage extends BasePage implements WebElementSelectorsPage, WebElementSelectorsFillInputAndClickOnElementPage {

    public ClickOnElementActionPage(WebDriver driver) {
        super(driver);
    }
    public void inputValidDataOfActionClickOnElement() {
        awaitUntilElementDisplayed(driver, actionNameFieldSelector);
        ClickOnElement clickOnElement = new ClickOnElement("Click on Element", ActionType.CLICK_ON_ELEMENT);
        sendKeys(driver, actionNameFieldSelector, clickOnElement.getActionName());
        click(driver, actionTypeFieldSelector);
        click(driver, getSelectActionTypeFromDropDownSelector(ActionType.CLICK_ON_ELEMENT));
    }
    public void clickOnProvideWayToLocateSelectorFromWebsite() {
        click(driver, provideWayToLocateSelector);
    }
    public void inputValidDataOfSelector() {
        ClickOnElement clickOnElement = new ClickOnElement("some xpath value", SelectorType.XPATH);
        sendKeys(driver, selectorValueFieldSelector, clickOnElement.getSelectorValue());
        click(driver, selectorTypeFieldSelector);
        click(driver, getSelectSelectorTypeFromDropDownSelector(SelectorType.XPATH));
    }
}
