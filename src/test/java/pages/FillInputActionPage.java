package pages;

import enums.ActionType;
import enums.SelectorType;
import selectors.WebElementSelectorsFillInputAndClickOnElementPage;
import selectors.WebElementSelectorsPage;
import utils.CreateBasicAction;
import utils.Interactions;

public class FillInputActionPage extends BasePage implements WebElementSelectorsPage, WebElementSelectorsFillInputAndClickOnElementPage {

    public FillInputActionPage(Interactions driver) {
        super(driver);
    }
    public CreateBasicAction.CreateBasicActionBuilder getDataFillInputBuilder() {
        CreateBasicAction.CreateBasicActionBuilder dataFillInput = new CreateBasicAction.CreateBasicActionBuilder();
                return dataFillInput;
    }
    public void inputValidDataOfActionFillInput() {
        CreateBasicAction fillInput = getDataFillInputBuilder().actionName("Fill Input").actionType(ActionType.FILL_INPUT).build();
        driver.sendKeys(actionNameFieldSelector, fillInput.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(fillInput.getActionType()));
    }
    public void clickOnProvideWayToLocateSelectorFromWebsite() {
        driver.click(provideWayToLocateSelector);
    }
    public void inputValidDataOfSelector() {
        CreateBasicAction fillInput = getDataFillInputBuilder().selectorValue("some xpath value").selectorType(SelectorType.XPATH).build();
        driver.sendKeys(selectorValueFieldSelector, fillInput.getSelectorValue());
        driver.click(selectorTypeFieldSelector);
        driver.click(getSelectSelectorTypeFromDropDownSelector(fillInput.getSelectorType()));
    }
}
