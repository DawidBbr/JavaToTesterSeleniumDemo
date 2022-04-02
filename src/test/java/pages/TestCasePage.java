package pages;

import selectors.WebElementSelectorsPage;
import utils.Interactions;

public class TestCasePage extends BasePage implements WebElementSelectorsPage {
    public TestCasePage(Interactions driver) {
        super(driver);
    }

    public ActionsPage goToActionsPage() {
        driver.click(topMenuActionsSelector);
        return new ActionsPage(driver);
    }
}
