package utils;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Interactions {
    private final int TIMEOUT = 5;
    protected WebDriver driver;

    public Interactions(WebDriver driver) {
        this.driver = driver;
    }

    public void awaitUntilElementDisplayed(By selector) {
        Awaitility.await().atMost(TIMEOUT, TimeUnit.SECONDS).ignoreExceptions().until(() -> driver.findElement(selector).isDisplayed());
    }
    public void awaitUntilElementToAppear(By selector) {
        Awaitility.await().atMost(10, TimeUnit.SECONDS).pollInterval(2,TimeUnit.SECONDS).ignoreExceptions().until(() -> driver.findElement(selector).isDisplayed());
    }


    public void click(By selector) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).click();
    }

    public void sendKeys(By selector, String keys) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).click();
        driver.findElement(selector).sendKeys(keys);
    }

    public void clear(By selector) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).clear();
    }

    public void clearByKeys(By selector) {
        awaitUntilElementDisplayed(selector);
        driver.findElement(selector).sendKeys(Keys.CONTROL, "a", Keys.DELETE);
    }

    public void ifDisplayedCheckIt(By selector) {
        if (driver.findElement(selector).isDisplayed()) {
            awaitUntilElementDisplayed(selector);
        }
    }

    public void ifDisplayedClick(By selector) {
        awaitUntilElementDisplayed(selector);
        if (driver.findElement(selector).isDisplayed()) {
            driver.findElement(selector).click();
        }
    }

    public void mouseOverElementAndClickOnSubElement(By elementToExpand, By subElement) {
        awaitUntilElementDisplayed(elementToExpand);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(elementToExpand)).perform();
        awaitUntilElementDisplayed(subElement);
        driver.findElement(subElement).click();
    }

    public void ifActionsExistCLickOnTheMainCheckBox(By rowDataNames, By theMainCheckBoxSelector,
                                                     By buttonDelete, By buttonYesOrNo) {
        if (driver.findElements(rowDataNames).size() > 0) {
            driver.findElement(theMainCheckBoxSelector).click();
            awaitUntilElementDisplayed(buttonDelete);
            driver.findElement(buttonDelete).click();
            awaitUntilElementDisplayed(buttonYesOrNo);
            driver.findElement(buttonYesOrNo).click();
        }
    }

    public void ifActionsExistAssertThem(By rowDataNames) {
        if (driver.findElements(rowDataNames).size() > 0) {
            awaitUntilElementDisplayed(rowDataNames);
        }
    }

    public void refreshPage() {
        JavascriptExecutor method = ((JavascriptExecutor) driver);
        method.executeScript("document.location.reload()");
    }

    public void scrollPage(int scrollFactor) {
        JavascriptExecutor scroll = ((JavascriptExecutor) driver);
        scroll.executeScript("window.scrollBy(0," + scrollFactor + ")");
    }

    public void scrollToVisibleElement(By selector) {
        awaitUntilElementDisplayed(selector);
        JavascriptExecutor scroll = ((JavascriptExecutor) driver);
        scroll.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(selector));
    }

    public void scrollToBottomOfPage() {
        JavascriptExecutor scroll = ((JavascriptExecutor) driver);
        scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void moveSlider(By slider, int shiftX, int shiftY) {
        awaitUntilElementDisplayed(slider);
        Actions move = new Actions(driver);
        move.dragAndDropBy(driver.findElement(slider), shiftX, shiftY).click();
        move.build().perform();
    }

    public void rightClick(By selector) {
        awaitUntilElementDisplayed(selector);
        Actions clicker = new Actions(driver);
        clicker.contextClick(driver.findElement(selector)).perform();
    }
}
