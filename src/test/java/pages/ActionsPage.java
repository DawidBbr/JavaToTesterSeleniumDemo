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
    public void clickOnAddNewActionsButton() {
        driver.awaitUntilElementDisplayed(addNewActionsButtonSelector);
        driver.click(addNewActionsButtonSelector);
    }

    public void clickOnNextActionStepButton() {
        driver.click(nextActionStepButtonSelector);
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
    public void clickInYesButtonToDeleteAllAction() {
        driver.click(getSelectVariantToDecideIfYouWantDeleteActions("Yes"));

    }
    public void fillValueInAction(String keys) {
        driver.sendKeys(fieldToInputValueOfActionSelector, keys);
    }
    public void assertActionWasCreated() {
        driver.awaitUntilElementDisplayed(successfullyOfCreatedActionSelector);
    }


}
