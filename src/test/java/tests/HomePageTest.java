package tests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {


    @BeforeEach
    void compose() {
        loginPage.sendLoginDataToLogIn();
        testCasePage = loginPage.clickOnSignInButton();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionNavigateToUrl() {
        actionsPage = testCasePage.goToActionsPage();
        actionTypesPage = actionsPage.clickOnAddNewActionsButton();
        actionsPage = actionTypesPage.inputValidDataOfActionNavigateToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.fillValueInAction("${URL}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionClickOnElement() {
        actionsPage = testCasePage.goToActionsPage();
        actionTypesPage = actionsPage.clickOnAddNewActionsButton();
        actionsPage = actionTypesPage.inputValidDataOfActionClickOnElement();
        actionTypesPage = actionsPage.clickOnNextActionStepButton();
        actionsPage = actionTypesPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionTypesPage = actionsPage.clickOnNextActionStepButton();
        actionsPage = actionTypesPage.inputValidDataOfSelectorClickOnElement();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionFillInput() {
        actionsPage = testCasePage.goToActionsPage();
        actionTypesPage = actionsPage.clickOnAddNewActionsButton();
        actionsPage = actionTypesPage.inputValidDataOfActionFillInput();
        actionTypesPage = actionsPage.clickOnNextActionStepButton();
        actionsPage = actionTypesPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionTypesPage = actionsPage.clickOnNextActionStepButton();
        actionsPage = actionTypesPage.inputValidDataOfSelectorFillInput();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.fillValueInAction("${value}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionManualActivity() {
        actionsPage = testCasePage.goToActionsPage();
        actionTypesPage = actionsPage.clickOnAddNewActionsButton();
        actionsPage = actionTypesPage.inputValidDataOfActionManualActivity();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.fillValueInAction("Do something manually");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfCreatedActionAssertionElementDisplayed() {
        actionsPage = testCasePage.goToActionsPage();
        actionTypesPage = actionsPage.clickOnAddNewActionsButton();
        actionsPage = actionTypesPage.inputValidDataOfActionAssertion();
        actionTypesPage = actionsPage.clickOnNextActionStepButton();
        actionsPage = actionTypesPage.clickOnAssertionTypeFromDropDown();
        actionTypesPage = actionsPage.clickOnNextActionStepButton();
        actionsPage = actionTypesPage.clickOnProvideWayToLocateSelectorFromWebsite();
        actionTypesPage = actionsPage.clickOnNextActionStepButton();
        actionsPage = actionTypesPage.inputValidDataOfSelectorAssertion();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
    }

    @Test
    public void shouldReturnSuccessOfDeletedAllExistingAction() {
        actionsPage = testCasePage.goToActionsPage();
        actionTypesPage = actionsPage.clickOnAddNewActionsButton();
        actionsPage = actionTypesPage.inputValidDataOfActionGoToUrl();
        actionsPage.clickOnNextActionStepButton();
        actionsPage.fillValueInAction("${URL}");
        actionsPage.clickOnNextActionStepButton();
        actionsPage.clickOnButtonFinishCreateAction();
        actionsPage.assertActionWasCreated();
        actionsPage.clickOnMainCheckBox();
        actionsPage.clickOnDeleteAllActions();
        actionTypesPage = actionsPage.clickInYesButtonToDeleteAllAction();
        actionTypesPage.assertActionWasDeleted();
    }
}
