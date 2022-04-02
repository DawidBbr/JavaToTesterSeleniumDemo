package selectors;

import enums.ActionType;
import enums.AssertionType;
import enums.SelectorType;
import org.openqa.selenium.By;

public interface WebElementSelectorsPage {
    By emailFieldInLoginPageDraplaSelector = By.id("email");
    By passwordFieldInLoginPageDraplaSelector = By.id("password");
    By incorrectFieldRegexPasswordSelector = By.id("error-password");
    By fieldCheckEmailAndPasswordSelector = By.id("error-backend");
    By signInButtonInLoginPageDraplaSelector = By.id("submit");
    By topMenuActionsSelector = By.id("top-menu-actions");
    By rowDataNamesSelector = By.xpath("//*[contains(@id,'row-data-name')]");
    By theMainCheckBoxForAllActionsSelector = By.xpath("//*[@class='th-checkboxes']//*[contains(@role,'checkbox')]");
    By deleteButtonInActions = By.xpath("//*[@label='Delete']");
    By addNewActionsButtonSelector = By.xpath("//*[@label='Add']");
    By actionNameFieldSelector = By.id("action-name");
    By actionTypeFieldSelector = By.id("action-type");
    By nextActionStepButtonSelector = By.xpath("//*[contains(text(),'Next')]");
    By fieldToInputValueOfActionSelector = By.xpath("//*[@ng-trim='false']");
    By finishActionStepButtonSelector = By.xpath("//*[contains(text(),'Finish')]");
    By successfullyOfDeletedActionSelector = By.xpath("//*[contains(text(),'Successfully deleted action')]");
    By successfullyOfCreatedActionSelector = By.xpath("//*[contains(text(),'Action created successfully')]");
    By assertionTypeFieldSelector = By.xpath("//*[contains(text(),'Assertion type')]");
    By provideWayToLocateSelector = By.xpath("//*[@class='provide-button box']");
    By selectorTypeFieldSelector = By.xpath("//*[contains(text(),'Selector type')]");
    By selectorValueFieldSelector = By.id("selector-value");

    default By getAssertionTypeFromDropDownSelector(AssertionType assertionType) {
        return (By.xpath("//*[contains(text(),'" + assertionType.getValue() + "')]"));
    }
    default By getSelectSelectorTypeFromDropDownSelector(SelectorType selectorType) {
        return (By.xpath("//*[text()='" + selectorType.getValue() + "']"));
    }

    default By getSelectActionTypeFromDropDownSelector(ActionType actionType) {
        return (By.xpath("//*[@aria-label='" + actionType.getValue() + "']"));
    }
    default By getSelectVariantToDecideIfYouWantDeleteActions(String yesOrNo) {
        return (By.xpath("//*[contains(text(),'" + yesOrNo + "')]"));
    }

}
