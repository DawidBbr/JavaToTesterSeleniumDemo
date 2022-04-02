package tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {


    @BeforeEach
    void compose() {
        loginPage.sendLoginDataToLogIn();
        loginPage.clickOnSignInButton();
    }


    @Test
    public void shouldReturnSuccessOfCreatedActionNavigateToUrl() {
        actionsPage = testCasePage.goToActionsPage();
        actionsPage.clickOnAddNewActionsButton();
        navigateToUrlActionPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.fillValueInAction("${URL}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionClickOnElement() {
        actionsPage = testCasePage.goToActionsPage();
        actionsPage.clickOnAddNewActionsButton();
        clickOnElementActionPage.inputValidDataOfActionClickOnElement();
        actionsPage.clickOnNextActionStepButton();
        clickOnElementActionPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionsPage.clickOnNextActionStepButton();
        clickOnElementActionPage.inputValidDataOfSelector();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionFillInput() {
        actionsPage = testCasePage.goToActionsPage();
        actionsPage.clickOnAddNewActionsButton();
        fillInputActionPage.inputValidDataOfActionFillInput();
        actionsPage.clickOnNextActionStepButton();
        fillInputActionPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionsPage.clickOnNextActionStepButton();
        fillInputActionPage.inputValidDataOfSelector();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.fillValueInAction("${value}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionManualActivity() {
        actionsPage = testCasePage.goToActionsPage();
        actionsPage.clickOnAddNewActionsButton();
        manualActivityActionPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.fillValueInAction("Do something manually");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionAssertionElementDisplayed() {
        actionsPage = testCasePage.goToActionsPage();
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
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfDeletedAllExistingAction() {
        actionsPage = testCasePage.goToActionsPage();
        actionsPage.clickOnAddNewActionsButton();
        navigateToUrlActionPage.inputValidDataOfActionGoToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.fillValueInAction("${URL}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
        actionsPage.clickOnMainCheckBox();
        actionsPage.clickOnDeleteAllActions();
        actionsPage.clickInYesButtonToDeleteAllAction();
        assertionsPage.assertActionWasDeleted();
    }
}
