package pages;

import utils.Interactions;

public abstract class BasePage {
    protected Interactions driver;

    public BasePage(Interactions driver) {
        this.driver = driver;
    }
}

