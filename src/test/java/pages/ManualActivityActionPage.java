package pages;

import selectors.WebElementSelectorsPage;
import enums.ActionType;
import org.openqa.selenium.WebDriver;
import utils.NavigateToUrlAndManualActivity;

import static utils.Interactions.*;

public class ManualActivityActionPage extends BasePage implements WebElementSelectorsPage {

    public ManualActivityActionPage(WebDriver driver) {
        super(driver);
    }
    public void inputValidDataOfActionNavigateToUrl() {
        awaitUntilElementDisplayed(driver, actionNameFieldSelector);
        NavigateToUrlAndManualActivity navigateToUrl = new NavigateToUrlAndManualActivity("Manual activity", ActionType.MANUAL_ACTIVITY);
        sendKeys(driver, actionNameFieldSelector, navigateToUrl.getActionName());
        click(driver, actionTypeFieldSelector);
        click(driver, getSelectActionTypeFromDropDownSelector(ActionType.MANUAL_ACTIVITY));
    }
}
