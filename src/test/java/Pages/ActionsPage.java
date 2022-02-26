package Pages;

import Selectors.WebElementSelectorsPage;
import org.openqa.selenium.WebDriver;

import static utils.Interactions.*;

public class ActionsPage extends BasePage implements WebElementSelectorsPage {

    public ActionsPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnTopMenuActionsOfDrapla() {
        click(driver, topMenuActionsSelector);
    }
    public void clickOnDeleteAllActionsIfAreDisplayed() {
        ifActionsExistCLickOnTheMainCheckBox(driver, rowDataNamesSelector, theMainCheckBoxForAllActionsSelector,
                deleteButtonInActions, getSelectVariantToDecideIfYouWantDeleteActions("Yes"));
    }
    public void clickOnAddNewActionsButton() {
        click(driver, addNewActionsButtonSelector);
    }

    public void clickOnNextActionStepButton() {
        click(driver, nextActionStepButtonSelector);
    }

    public void clickOnButtonFinishCreateAction() {
        click(driver, finishActionStepButtonSelector);
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
