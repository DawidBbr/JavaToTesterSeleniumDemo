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
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
        assertionsPage.assertIfAnyActionsExist();
        actionsPage.clickOnAddNewActionsButton();
        navigateToUrlActionPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.inputValueToAction("${URL}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        assertionsPage.assertListOfActionsIsDisplayed();
    }

    @Test
    public void shouldReturnSuccessOfDeletedActionNavigateToUrl() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionClickOnElement() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
        actionsPage.clickOnAddNewActionsButton();
        clickOnElementActionPage.inputValidDataOfActionClickOnElement();
        actionsPage.clickOnNextActionStepButton();
        clickOnElementActionPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionsPage.clickOnNextActionStepButton();
        clickOnElementActionPage.inputValidDataOfSelector();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        assertionsPage.assertListOfActionsIsDisplayed();
    }

    @Test
    public void shouldReturnSuccessOfDeletedActionClickOnElement() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionFillInput() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
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
        assertionsPage.assertListOfActionsIsDisplayed();
    }

    @Test
    public void shouldReturnSuccessOfDeletedActionFillInput() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionManualActivity() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
        actionsPage.clickOnAddNewActionsButton();
        manualActivityActionPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.inputValueToAction("Do something manually");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        assertionsPage.assertListOfActionsIsDisplayed();
    }

    @Test
    public void shouldReturnSuccessOfDeletedActionManualActivity() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionAssertionElementDisplayed() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAllActionsIfAreDisplayed();
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
        assertionsPage.assertListOfActionsIsDisplayed();
    }

    @Test
    public void shouldReturnSuccessOfDeletedActionAssertionElementDisplayed() {
        actionsPage.clickOnTopMenuActionsOfDrapla();
        actionsPage.clickOnDeleteAction();
        actionsPage.clickInYesButtonToDeleteOneAction();
        assertionsPage.assertActionWasDeleted();
    }
}
