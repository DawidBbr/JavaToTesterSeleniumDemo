package Pages;

import Selectors.WebElementSelectorsPage;
import org.openqa.selenium.WebDriver;

import static utils.Interactions.awaitUntilElementDisplayed;
import static utils.Interactions.ifActionsExistAssertThem;

public class AssertionsPage  extends BasePage implements WebElementSelectorsPage {


    public AssertionsPage(WebDriver driver) {
        super(driver);
    }
    public void assertTopMenuActionsButtonIsDisplayed() {
        awaitUntilElementDisplayed(driver, topMenuActionsSelector);
    }

    public void assertAddNewActionsButtonIsDisplayed() {
        awaitUntilElementDisplayed(driver, addNewActionsButtonSelector);
    }
    public void assertActionNameFieldIsDisplayed() {
        awaitUntilElementDisplayed(driver, actionNameFieldSelector);
    }
    public void assertListOfActionsIsDisplayed() {
        awaitUntilElementDisplayed(driver, rowDataNamesSelector);
    }
    public void assertIfAnyActionsExist() {
        ifActionsExistAssertThem(driver, rowDataNamesSelector);
    }
    public void assertActionWasDeleted() {
        awaitUntilElementDisplayed(driver, successfullyOfDeleteActionSelector);
    }
}
