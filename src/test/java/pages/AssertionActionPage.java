package pages;

import enums.ActionType;
import enums.AssertionType;
import enums.SelectorType;
import selectors.WebElementSelectorsAssertionPage;
import selectors.WebElementSelectorsPage;
import utils.CreateBasicAction;
import utils.Interactions;

public class AssertionActionPage extends BasePage implements WebElementSelectorsPage, WebElementSelectorsAssertionPage {

    public AssertionActionPage(Interactions driver) {
        super(driver);
    }
    public CreateBasicAction.CreateBasicActionBuilder getDataAssertionBuilder() {
        CreateBasicAction.CreateBasicActionBuilder dataAssertion = new CreateBasicAction.CreateBasicActionBuilder();
        return dataAssertion;
    }
    public void inputValidDataOfActionAssertion() {
        CreateBasicAction assertion = getDataAssertionBuilder().actionName("Assertion").actionType(ActionType.ASSERTION).build();
        driver.sendKeys(actionNameFieldSelector, assertion.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(assertion.getActionType()));
    }
    public void clickOnAssertionTypeFromDropDown() {
        CreateBasicAction assertion = getDataAssertionBuilder().assertionType(AssertionType.ELEMENT_DISPLAYED).build();
        driver.click(assertionTypeFieldSelector);
        driver.click(getAssertionTypeFromDropDownSelector(assertion.getAssertionType()));
    }
    public void clickOnProvideWayToLocateSelectorFromWebsite() {
        driver.click(provideWayToLocateSelector);
    }
    public void inputValidDataOfSelector() {
        CreateBasicAction assertion = getDataAssertionBuilder().selectorValue("xpath").selectorType(SelectorType.XPATH).build();
        driver.sendKeys(selectorValueFieldSelector, assertion.getSelectorValue());
        driver.click(selectorTypeFieldSelector);
        driver.click(getSelectSelectorTypeFromDropDownSelector(assertion.getSelectorType()));
    }
    }


