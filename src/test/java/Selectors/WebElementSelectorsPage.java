package Selectors;

import enums.ActionType;
import org.openqa.selenium.By;

public interface WebElementSelectorsPage {
    By emailFieldInLoginPageDraplaSelector = By.id("email");
    By passwordFieldInLoginPageDraplaSelector = By.id("password");
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
    By deleteOneActionButtonSelector = By.xpath("//*[contains(@id,'table-delete-button')]");
    By successfullyOfDeleteActionSelector = By.xpath("//*[contains(text(),'Successfully deleted action')]");


    default By getSelectActionTypeFromDropDownSelector(ActionType actionType) {
        return (By.xpath("//*[@aria-label='" + actionType.getValue() + "']"));
    }
    default By getSelectVariantToDecideIfYouWantDeleteActions(String yesOrNo) {
        return (By.xpath("//*[contains(text(),'" + yesOrNo + "')]"));
    }

}
