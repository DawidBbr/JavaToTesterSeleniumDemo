package Pages;

import Selectors.WebElementSelectorsPage;
import enums.ActionType;
import org.openqa.selenium.WebDriver;
import utils.NavigateToUrlAndManualActivity;

import static utils.Interactions.click;
import static utils.Interactions.sendKeys;

public class ManualActivityActionPage extends BasePage implements WebElementSelectorsPage {

    public ManualActivityActionPage(WebDriver driver) {
        super(driver);
    }
    public void inputValidDataOfActionNavigateToUrl() {
        NavigateToUrlAndManualActivity navigateToUrl = new NavigateToUrlAndManualActivity("Manual activity", ActionType.MANUAL_ACTIVITY);
        sendKeys(driver, actionNameFieldSelector, navigateToUrl.getActionName());
        click(driver, actionTypeFieldSelector);
        click(driver, getSelectActionTypeFromDropDownSelector(ActionType.MANUAL_ACTIVITY));
    }
}
