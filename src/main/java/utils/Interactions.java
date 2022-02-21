package utils;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Interactions {

    private final static int TIMEOUT = 5;

    public static void awaitUntilElementDisplayed(WebDriver driver, By selector) {
        Awaitility.await().atMost(TIMEOUT, TimeUnit.SECONDS).ignoreExceptions().until(() -> driver.findElement(selector).isDisplayed());
    }

    public static void click(WebDriver driver, By selector) {
        awaitUntilElementDisplayed(driver, selector);
        driver.findElement(selector).click();
    }

    public static void sendKeys(WebDriver driver, By selector, String keys) {
        awaitUntilElementDisplayed(driver, selector);
        driver.findElement(selector).click();
        driver.findElement(selector).sendKeys(keys);
    }

    public static void clickAfterClick(WebDriver driver, By selector, By selector2) {
        awaitUntilElementDisplayed(driver, selector);
        driver.findElement(selector).click();
        awaitUntilElementDisplayed(driver, selector2);
        driver.findElement(selector2).click();
    }

    public static boolean isElementDisplayed(WebDriver driver, By selector)
    {
        boolean elementPresent=false;
        try {
            if(driver.findElement(selector).isDisplayed())
            {
                elementPresent=true;
            }
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Element is not present " +e);
        }
        return elementPresent;
    }
    public static void hoverOverAndClickOnDropDownElement(WebDriver driver, By fieldToExpandSelector, By elementFromDropDownSelector) {
        awaitUntilElementDisplayed(driver, fieldToExpandSelector);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(fieldToExpandSelector)).perform();
        awaitUntilElementDisplayed(driver, elementFromDropDownSelector);
        driver.findElement(elementFromDropDownSelector).click();
    }
    public static void moveSliderFromOnePlaceToDestination(WebDriver driver, By selector) {
        awaitUntilElementDisplayed(driver, selector);
        Actions slider = new Actions(driver);
        slider.moveToElement(driver.findElement(selector)).clickAndHold().moveByOffset(0,50).release().perform();
    }
}
