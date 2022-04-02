package pages;

import selectors.WebElementSelectorsPage;
import utils.Interactions;

public class AssertionsPage  extends BasePage implements WebElementSelectorsPage {


    public AssertionsPage(Interactions driver) {
        super(driver);
    }
    public void assertIfAnyActionsExist() {
        driver.ifActionsExistAssertThem(rowDataNamesSelector);
    }
    public void assertActionWasDeleted() {
        driver.awaitUntilElementDisplayed(successfullyOfDeletedActionSelector);
    }
}
