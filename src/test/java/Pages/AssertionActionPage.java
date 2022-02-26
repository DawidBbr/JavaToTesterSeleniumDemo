package Pages;

import Selectors.WebElementSelectorsAssertionPage;
import Selectors.WebElementSelectorsPage;
import enums.ActionType;
import enums.AssertionType;
import enums.SelectorType;
import org.openqa.selenium.WebDriver;
import utils.Assertion;

import static utils.Interactions.click;
import static utils.Interactions.sendKeys;

public class AssertionActionPage extends BasePage implements WebElementSelectorsPage, WebElementSelectorsAssertionPage {

    public AssertionActionPage(WebDriver driver) {
        super(driver);
    }
    public void inputValidDataOfActionAssertion() {
        Assertion assertion = new Assertion("Assertion", ActionType.ASSERTION);
        sendKeys(driver, actionNameFieldSelector, assertion.getActionName());
        click(driver, actionTypeFieldSelector);
        click(driver, getSelectActionTypeFromDropDownSelector(ActionType.ASSERTION));
    }
    public void clickOnAssertionTypeFromDropDown() {
        click(driver, assertionTypeFieldSelector);
        click(driver, getAssertionTypeFromDropDownSelector(AssertionType.ELEMENT_DISPLAYED));
    }
    public void clickOnProvideWayToLocateSelectorFromWebsite() {
        click(driver, provideWayToLocateSelector);
    }
    public void inputValidDataOfSelector() {
        Assertion assertion = new Assertion("some xpath value", SelectorType.XPATH);
        sendKeys(driver, selectorValueFieldSelector, assertion.getSelectorValue());
        click(driver, selectorTypeFieldSelector);
        click(driver, getSelectSelectorTypeFromDropDownSelector(SelectorType.XPATH));
    }
    }


