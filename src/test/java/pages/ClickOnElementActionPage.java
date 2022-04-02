package pages;

import enums.ActionType;
import enums.SelectorType;
import selectors.WebElementSelectorsFillInputAndClickOnElementPage;
import selectors.WebElementSelectorsPage;
import utils.CreateBasicAction;
import utils.Interactions;

public class ClickOnElementActionPage extends BasePage implements WebElementSelectorsPage, WebElementSelectorsFillInputAndClickOnElementPage {

    public ClickOnElementActionPage(Interactions driver) {
        super(driver);
    }
    public CreateBasicAction.CreateBasicActionBuilder getDataClickOnElementBuilder() {
        CreateBasicAction.CreateBasicActionBuilder dataClickOnElement = new CreateBasicAction.CreateBasicActionBuilder();
        return dataClickOnElement;
    }

    public void inputValidDataOfActionClickOnElement() {
        CreateBasicAction clickOnElement = getDataClickOnElementBuilder().actionName("Click on element").actionType(ActionType.CLICK_ON_ELEMENT).build();
        driver.sendKeys(actionNameFieldSelector, clickOnElement.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(clickOnElement.getActionType()));
    }

    public void clickOnProvideWayToLocateSelectorFromWebsite() {
        driver.click(provideWayToLocateSelector);
    }

    public void inputValidDataOfSelector() {
        CreateBasicAction clickOnElement = getDataClickOnElementBuilder().selectorValue("xpath").selectorType(SelectorType.XPATH).build();
        driver.sendKeys(selectorValueFieldSelector, clickOnElement.getSelectorValue());
        driver.click(selectorTypeFieldSelector);
        driver.click(getSelectSelectorTypeFromDropDownSelector(clickOnElement.getSelectorType()));
    }
}
