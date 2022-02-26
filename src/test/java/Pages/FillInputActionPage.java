package Pages;

import Selectors.WebElementSelectorsFillInputAndClickOnElementPage;
import Selectors.WebElementSelectorsPage;
import enums.ActionType;
import enums.SelectorType;
import org.openqa.selenium.WebDriver;
import utils.ClickOnElement;
import utils.FillInput;

import static utils.Interactions.click;
import static utils.Interactions.sendKeys;

public class FillInputActionPage extends BasePage implements WebElementSelectorsPage, WebElementSelectorsFillInputAndClickOnElementPage {

    public FillInputActionPage(WebDriver driver) {
        super(driver);
    }
    public void inputValidDataOfActionFillInput() {
        FillInput fillInput = new FillInput("Click on Element", ActionType.FILL_INPUT);
        sendKeys(driver, actionNameFieldSelector, fillInput.getActionName());
        click(driver, actionTypeFieldSelector);
        click(driver, getSelectActionTypeFromDropDownSelector(ActionType.FILL_INPUT));
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
