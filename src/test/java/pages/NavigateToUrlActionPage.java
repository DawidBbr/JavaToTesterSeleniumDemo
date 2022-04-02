package pages;

import enums.ActionType;
import selectors.WebElementSelectorsPage;
import utils.CreateBasicAction;
import utils.Interactions;

public class NavigateToUrlActionPage extends BasePage implements WebElementSelectorsPage {

    ActionsPage actionsPage;

    public NavigateToUrlActionPage(Interactions driver) {
        super(driver);
    }
    public CreateBasicAction.CreateBasicActionBuilder getDataNavigateToUrlBuilder() {
        CreateBasicAction.CreateBasicActionBuilder dataNavigateToUrl =
                new CreateBasicAction.CreateBasicActionBuilder();
        return dataNavigateToUrl;
    }

    public void inputValidDataOfActionNavigateToUrl() {
        CreateBasicAction navigateToUrl =
                getDataNavigateToUrlBuilder().actionName("Navigate To Url").actionType(ActionType.NAVIGATE_TO_URL).build();
        driver.sendKeys(actionNameFieldSelector, navigateToUrl.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(navigateToUrl.getActionType()));
    }
    public void inputValidDataOfActionGoToUrl() {
        CreateBasicAction navigateToUrl =
                getDataNavigateToUrlBuilder().actionName("Go to URL").actionType(ActionType.NAVIGATE_TO_URL).build();
        driver.sendKeys(actionNameFieldSelector, navigateToUrl.getActionName());
        driver.click(actionTypeFieldSelector);
        driver.click(getSelectActionTypeFromDropDownSelector(navigateToUrl.getActionType()));
    }
}
