package Pages;

import Selectors.WebElementSelectorsPage;
import enums.ActionType;
import org.openqa.selenium.WebDriver;
import utils.NavigateToUrlAndManualActivity;

import static utils.Interactions.click;
import static utils.Interactions.sendKeys;

public class NavigateToUrlActionPage extends BasePage implements WebElementSelectorsPage {

    public NavigateToUrlActionPage(WebDriver driver) {
        super(driver);
    }
    public void inputValidDataOfActionNavigateToUrl() {
        NavigateToUrlAndManualActivity navigateToUrl = new NavigateToUrlAndManualActivity("Navigate to Url", ActionType.NAVIGATE_TO_URL);
        sendKeys(driver, actionNameFieldSelector, navigateToUrl.getActionName());
        click(driver, actionTypeFieldSelector);
        click(driver, getSelectActionTypeFromDropDownSelector(ActionType.NAVIGATE_TO_URL));
    }
}
