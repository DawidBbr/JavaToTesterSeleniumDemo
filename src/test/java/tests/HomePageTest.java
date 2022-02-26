package tests;

import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void shouldReturnSuccessfulCreationOfActionNavigateToUrl() {
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
        navigateToUrlActionPage.inputValueToAction("${URL}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        assertionsPage.assertListOfActionsIsDisplayed();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }

    @Test
    public void shouldReturnSuccessfulCreationOfActionClickOnElement() {
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
}
