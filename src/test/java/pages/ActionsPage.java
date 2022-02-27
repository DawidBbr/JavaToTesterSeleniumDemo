package pages;

import selectors.WebElementSelectorsPage;
import org.openqa.selenium.WebDriver;

import static utils.Interactions.*;

public class ActionsPage extends BasePage implements WebElementSelectorsPage {

    public ActionsPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnTopMenuActionsOfDrapla() {
        awaitUntilElementDisplayed(driver, topMenuActionsSelector);
        click(driver, topMenuActionsSelector);
    }
    public void clickOnDeleteAllActionsIfAreDisplayed() {
        awaitUntilElementDisplayed(driver, addNewActionsButtonSelector);
        ifActionsExistCLickOnTheMainCheckBox(driver, rowDataNamesSelector, theMainCheckBoxForAllActionsSelector,
                deleteButtonInActions, getSelectVariantToDecideIfYouWantDeleteActions("Yes"));
    }
    public void clickOnAddNewActionsButton() {
        awaitUntilElementDisplayed(driver, addNewActionsButtonSelector);
        click(driver, addNewActionsButtonSelector);
    }

    public void clickOnNextActionStepButton() {
        click(driver, nextActionStepButtonSelector);
    }

    public void clickOnButtonFinishCreateAction() {
        click(driver, finishActionStepButtonSelector);
        awaitUntilElementDisplayed(driver, rowDataNamesSelector);
    }
    public  void clickOnDeleteAction() {
        click(driver, deleteOneActionButtonSelector);
    }
    public void clickInYesButtonToDeleteOneAction() {
        click(driver, getSelectVariantToDecideIfYouWantDeleteActions("Yes"));
    }
    public void inputValueToAction(String keys) {
        sendKeys(driver, fieldToInputValueOfActionSelector, keys);
    }
}
