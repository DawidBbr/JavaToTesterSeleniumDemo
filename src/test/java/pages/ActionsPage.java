package pages;

import selectors.WebElementSelectorsPage;
import utils.Interactions;

public class ActionsPage extends BasePage implements WebElementSelectorsPage {

    public ActionsPage(Interactions driver) {
        super(driver);
    }
    public void clickOnDeleteAllActionsIfAreDisplayed() {
        driver.awaitUntilElementDisplayed(addNewActionsButtonSelector);
        driver.ifActionsExistCLickOnTheMainCheckBox(rowDataNamesSelector, theMainCheckBoxForAllActionsSelector,
                deleteButtonInActions, getSelectVariantToDecideIfYouWantDeleteActions("Yes"));
    }
    public ActionTypesPage clickOnAddNewActionsButton() {
        driver.click(addNewActionsButtonSelector);
        return new ActionTypesPage(driver);
    }

    public ActionTypesPage clickOnNextActionStepButton() {
        driver.click(nextActionStepButtonSelector);
        return new ActionTypesPage(driver);
    }
    public void clickOnMainCheckBox() {
        driver.click(theMainCheckBoxForAllActionsSelector);
    }
    public void clickOnButtonFinishCreateAction() {
        driver.click(finishActionStepButtonSelector);
    }

    public  void clickOnDeleteAllActions() {
        driver.awaitUntilElementToAppear(deleteButtonInActions);
        driver.click(deleteButtonInActions);

    }
    public ActionTypesPage clickInYesButtonToDeleteAllAction() {
        driver.click(getSelectVariantToDecideIfYouWantDeleteActions("Yes"));
        return new ActionTypesPage(driver);

    }
    public void fillValueInAction(String keys) {
        driver.sendKeys(fieldToInputValueOfActionSelector, keys);
    }
    public void assertActionWasCreated() {
        driver.awaitUntilElementDisplayed(successfullyOfCreatedActionSelector);
    }


}
