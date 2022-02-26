package Pages;

import Selectors.WebElementSelectorsPage;
import enums.ActionType;
import org.openqa.selenium.WebDriver;
import utils.NavigateToUrl;

import static utils.Interactions.click;
import static utils.Interactions.sendKeys;

public class NavigateToUrlActionPage extends BasePage implements WebElementSelectorsPage {

    public NavigateToUrlActionPage(WebDriver driver) {
        super(driver);
    }
    public void inputValidDataOfActionNavigateToUrl() {
        NavigateToUrl navigateToUrl = new NavigateToUrl("Navigate to Url", ActionType.NAVIGATE_TO_URL);
        sendKeys(driver, actionNameFieldSelector, navigateToUrl.getActionName());
        click(driver, actionTypeFieldSelector);
        click(driver, getSelectActionTypeFromDropDownSelector(ActionType.NAVIGATE_TO_URL));
    }
    public void inputValueToAction(String keys) {
        sendKeys(driver, fieldToInputValueOfActionSelector, keys);
    }


}
