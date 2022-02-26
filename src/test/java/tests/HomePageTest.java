package tests;

import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void shouldReturnSuccessfulCreationOfActionNavigateToUrlAndDeleteThatAction() {
        loginPage.sendLoginDataToLogIn();
        loginPage.clickOnSignInButton();
        assertionsPage.assertTopMenuActionsButtonIsDisplayed();
        actionsPage.clickOnTopMenuActionsOfDrapla();
        assertionsPage.assertAddNewActionsButtonIsDisplayed();
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
        assertionsPage.assertAddNewActionsButtonIsDisplayed();
        assertionsPage.assertIfAnyActionsExist();
        actionsPage.clickOnAddNewActionsButton();
        assertionsPage.assertActionNameFieldIsDisplayed();
        navigateToUrlActionPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.inputValueToAction("${URL}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        assertionsPage.assertListOfActionsIsDisplayed();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }

    @Test
    public void shouldReturnSuccessfulCreationOfActionClickOnElementAndDeleteThatAction() {
        loginPage.sendLoginDataToLogIn();
        loginPage.clickOnSignInButton();
        assertionsPage.assertTopMenuActionsButtonIsDisplayed();
        actionsPage.clickOnTopMenuActionsOfDrapla();
        assertionsPage.assertAddNewActionsButtonIsDisplayed();
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
        assertionsPage.assertAddNewActionsButtonIsDisplayed();
        actionsPage.clickOnAddNewActionsButton();
        assertionsPage.assertActionNameFieldIsDisplayed();
        clickOnElementActionPage.inputValidDataOfActionClickOnElement();
        actionsPage.clickOnNextActionStepButton();
        clickOnElementActionPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionsPage.clickOnNextActionStepButton();
        clickOnElementActionPage.inputValidDataOfSelector();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        assertionsPage.assertListOfActionsIsDisplayed();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }
    @Test
    public void shouldReturnSuccessfulCreationOfActionFillInputAndDeleteThatAction() {
        loginPage.sendLoginDataToLogIn();
        loginPage.clickOnSignInButton();
        assertionsPage.assertTopMenuActionsButtonIsDisplayed();
        actionsPage.clickOnTopMenuActionsOfDrapla();
        assertionsPage.assertAddNewActionsButtonIsDisplayed();
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
        assertionsPage.assertAddNewActionsButtonIsDisplayed();
        actionsPage.clickOnAddNewActionsButton();
        assertionsPage.assertActionNameFieldIsDisplayed();
        fillInputActionPage.inputValidDataOfActionFillInput();
        actionsPage.clickOnNextActionStepButton();
        fillInputActionPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionsPage.clickOnNextActionStepButton();
        fillInputActionPage.inputValidDataOfSelector();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.inputValueToAction("${value}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        assertionsPage.assertListOfActionsIsDisplayed();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }
    @Test
    public void shouldReturnSuccessfulCreationOfActionManualActivityAndDeleteThatAction() {
        loginPage.sendLoginDataToLogIn();
        loginPage.clickOnSignInButton();
        assertionsPage.assertTopMenuActionsButtonIsDisplayed();
        actionsPage.clickOnTopMenuActionsOfDrapla();
        assertionsPage.assertAddNewActionsButtonIsDisplayed();
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
        assertionsPage.assertAddNewActionsButtonIsDisplayed();
        actionsPage.clickOnAddNewActionsButton();
        assertionsPage.assertActionNameFieldIsDisplayed();
        manualActivityActionPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.inputValueToAction("Do something manually");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        assertionsPage.assertListOfActionsIsDisplayed();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
}
}
