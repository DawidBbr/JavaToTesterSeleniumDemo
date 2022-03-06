package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    @BeforeEach
    public void logInToDrapla() {
        loginPage.sendLoginDataToLogIn();
        loginPage.clickOnSignInButton();
    }
    @Test
    public void shouldReturnSuccessOfCreatedActionNavigateToUrl() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnAddNewActionsButton();
        navigateToUrlActionPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.inputValueToAction("${URL}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionClickOnElement() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnAddNewActionsButton();
        clickOnElementActionPage.inputValidDataOfActionClickOnElement();
        actionsPage.clickOnNextActionStepButton();
        clickOnElementActionPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionsPage.clickOnNextActionStepButton();
        clickOnElementActionPage.inputValidDataOfSelector();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionFillInput() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnAddNewActionsButton();
        fillInputActionPage.inputValidDataOfActionFillInput();
        actionsPage.clickOnNextActionStepButton();
        fillInputActionPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionsPage.clickOnNextActionStepButton();
        fillInputActionPage.inputValidDataOfSelector();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.inputValueToAction("${value}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionManualActivity() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnAddNewActionsButton();
        manualActivityActionPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.inputValueToAction("Do something manually");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionAssertionElementDisplayed() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnAddNewActionsButton();
        assertionActionPage.inputValidDataOfActionAssertion();
        actionsPage.clickOnNextActionStepButton();
        assertionActionPage.clickOnAssertionTypeFromDropDown();
        actionsPage.clickOnNextActionStepButton();
        assertionActionPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionsPage.clickOnNextActionStepButton();
        assertionActionPage.inputValidDataOfSelector();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
    }

    @Test
    public void shouldReturnSuccessOfDeletedAllExistingAction() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnMainCheckBox();
        actionsPage.clickOnDeleteAllActions();
        actionsPage.clickInYesButtonToDeleteAllAction();
        assertionsPage.assertActionWasDeleted();
    }
}
