package pages;

import selectors.WebElementSelectorsPage;
import enums.ActionType;
import utils.CreateBasicAction;
import utils.Interactions;

public class ManualActivityActionPage extends BasePage implements WebElementSelectorsPage {

    public ManualActivityActionPage(Interactions driver) {
        super(driver);
    }

    public CreateBasicAction.CreateBasicActionBuilder getDataManualActivityBuilder() {
        CreateBasicAction.CreateBasicActionBuilder dataManualActivity = new CreateBasicAction.CreateBasicActionBuilder();
        return dataManualActivity;
    }

    public void inputValidDataOfActionNavigateToUrl() {
        CreateBasicAction manualActivity =
                getDataManualActivityBuilder().actionName("Manual activity").actionType(ActionType.MANUAL_ACTIVITY).build();
        driver.sendKeys(actionNameFieldSelector, manualActivity.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(manualActivity.getActionType()));
    }
}
