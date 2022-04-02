package pages;

import enums.ActionType;
import enums.AssertionType;
import enums.SelectorType;
import selectors.WebElementSelectorsPage;
import utils.CreateBasicAction;
import utils.Interactions;

import static builders.ActionTypesBuilder.getDataActionTypesBuilder;

public class ActionTypesPage extends BasePage implements WebElementSelectorsPage {
    public ActionTypesPage(Interactions driver) {
        super(driver);
    }
    public ActionsPage inputValidDataOfActionNavigateToUrl() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().actionName("Navigate To Url").actionType(ActionType.NAVIGATE_TO_URL).build();
        driver.sendKeys(actionNameFieldSelector, dataActionTypes.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(dataActionTypes.getActionType()));
        return new ActionsPage(driver);
    }
    public ActionsPage inputValidDataOfActionGoToUrl() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().actionName("Go to URL").actionType(ActionType.NAVIGATE_TO_URL).build();
        driver.sendKeys(actionNameFieldSelector, dataActionTypes.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(dataActionTypes.getActionType()));
        return new ActionsPage(driver);
    }
    public ActionsPage inputValidDataOfActionClickOnElement() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().actionName("Click on element").actionType(ActionType.CLICK_ON_ELEMENT).build();
        driver.sendKeys(actionNameFieldSelector, dataActionTypes.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(dataActionTypes.getActionType()));
        return new ActionsPage(driver);
    }

    public ActionsPage clickOnProvideWayToLocateSelectorFromWebsite() {
        driver.click(provideWayToLocateSelector);
        return new ActionsPage(driver);
    }

    public ActionsPage inputValidDataOfSelectorClickOnElement() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().selectorValue("xpath").selectorType(SelectorType.XPATH).build();
        driver.sendKeys(selectorValueFieldSelector, dataActionTypes.getSelectorValue());
        driver.click(selectorTypeFieldSelector);
        driver.click(getSelectSelectorTypeFromDropDownSelector(dataActionTypes.getSelectorType()));
        return new ActionsPage(driver);
    }
    public ActionsPage inputValidDataOfActionFillInput() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().actionName("Fill Input").actionType(ActionType.FILL_INPUT).build();
        driver.sendKeys(actionNameFieldSelector, dataActionTypes.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(dataActionTypes.getActionType()));
        return new ActionsPage(driver);
    }

    public ActionsPage inputValidDataOfSelectorFillInput() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().selectorValue("some xpath value").selectorType(SelectorType.XPATH).build();
        driver.sendKeys(selectorValueFieldSelector, dataActionTypes.getSelectorValue());
        driver.click(selectorTypeFieldSelector);
        driver.click(getSelectSelectorTypeFromDropDownSelector(dataActionTypes.getSelectorType()));
        return new ActionsPage(driver);
    }
    public ActionsPage inputValidDataOfActionManualActivity() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().actionName("Manual activity").actionType(ActionType.MANUAL_ACTIVITY).build();
        driver.sendKeys(actionNameFieldSelector, dataActionTypes.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(dataActionTypes.getActionType()));
        return new ActionsPage(driver);
    }
    public ActionsPage inputValidDataOfActionAssertion() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().actionName("Assertion").actionType(ActionType.ASSERTION).build();
        driver.sendKeys(actionNameFieldSelector, dataActionTypes.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(dataActionTypes.getActionType()));
        return new ActionsPage(driver);
    }
    public ActionsPage clickOnAssertionTypeFromDropDown() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().assertionType(AssertionType.ELEMENT_DISPLAYED).build();
        driver.click(assertionTypeFieldSelector);
        driver.click(getAssertionTypeFromDropDownSelector(dataActionTypes.getAssertionType()));
        return new ActionsPage(driver);
    }
    public ActionsPage inputValidDataOfSelectorAssertion() {
        CreateBasicAction dataActionTypes = getDataActionTypesBuilder().selectorValue("xpath").selectorType(SelectorType.XPATH).build();
        driver.sendKeys(selectorValueFieldSelector, dataActionTypes.getSelectorValue());
        driver.click(selectorTypeFieldSelector);
        driver.click(getSelectSelectorTypeFromDropDownSelector(dataActionTypes.getSelectorType()));
        return new ActionsPage(driver);
    }
    public void assertActionWasDeleted() {
        driver.awaitUntilElementDisplayed(successfullyOfDeletedActionSelector);
    }

}
