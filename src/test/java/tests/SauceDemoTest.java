package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SauceDemoTest extends BaseTest {

    @Test
    public void checkCanLogInSauceDemoAndBuySomething() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //IMPLICIT WAIT

        driver.get(BASE_URL);
        WebElement userNameInputElement = driver.findElement(By.xpath("//*[@placeholder='Username']"));
        userNameInputElement.click();
        userNameInputElement.sendKeys("standard_user");

        WebElement passwordInputElement = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        passwordInputElement.click();
        passwordInputElement.sendKeys("secret_sauce");

        WebElement loginClickElement = driver.findElement(By.xpath("//*[@data-test='login-button']"));
        loginClickElement.click();

        WebElement clickOnProductElement = driver.findElement(By.xpath("//*[text() = 'Sauce Labs Backpack']/.."));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));        //EXPLICIT WAIT
        wait.until(ExpectedConditions.visibilityOf(clickOnProductElement));           //EXPLICIT WAIT

        clickOnProductElement.click();

        WebElement clickOnAddToCart = driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']"));
        clickOnAddToCart.click();

        WebElement clickOnMyShopping = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        clickOnMyShopping.click();

        WebElement clickRemoveProductInMyShoppingElement = driver.findElement(By.xpath("//*[@id='remove-sauce-labs-backpack']"));
        clickRemoveProductInMyShoppingElement.click();

        WebElement clickContinueShoppingElement = driver.findElement(By.xpath("//*[@id='continue-shopping']"));
        clickContinueShoppingElement.click();
    }

    @Test
    public void checkCanBuyManyProductAndRemoveAll() {

        driver.get(BASE_URL);
        WebElement userNameInputElement = driver.findElement(By.xpath("//*[@placeholder='Username']"));
        userNameInputElement.click();
        userNameInputElement.sendKeys("standard_user");

        WebElement passwordInputElement = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        passwordInputElement.click();
        passwordInputElement.sendKeys("secret_sauce");

        WebElement loginClickElement = driver.findElement(By.xpath("//*[@data-test='login-button']"));
        loginClickElement.click();

        WebElement clickOnAddBackPackToCartElement = driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']"));
        WebDriverWait waitWhenILogIn = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitWhenILogIn.until(ExpectedConditions.visibilityOf(clickOnAddBackPackToCartElement));
        clickOnAddBackPackToCartElement.click();

        WebElement clickOnAddTShirtToCartElement = driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        clickOnAddTShirtToCartElement.click();

        WebElement clickOnAddBikeLightToCartElement = driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-bike-light']"));
        clickOnAddBikeLightToCartElement.click();

        WebElement clickOnAddFleeceJacketToCartElement = driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-fleece-jacket']"));
        clickOnAddFleeceJacketToCartElement.click();

        WebElement clickOnAddLabsOnesieToCartElement = driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-onesie']"));
        clickOnAddLabsOnesieToCartElement.click();

        WebElement clickOnAddTestAllTheThingsTshirtRedToCartElement = driver.findElement
                (By.xpath("//*[@data-test='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        clickOnAddTestAllTheThingsTshirtRedToCartElement.click();

        WebElement clickOnMyShoppingIconElement = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        clickOnMyShoppingIconElement.click();

        WebElement clickCheckOutListMyBuyingProductElement = driver.findElement(By.xpath("//*[@data-test='checkout']"));
        clickCheckOutListMyBuyingProductElement.click();

        WebElement clickPlaceFirstNameElement = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
        clickPlaceFirstNameElement.click();
        clickPlaceFirstNameElement.sendKeys("Dawid");

        WebElement clickPlaceLastNameElement = driver.findElement(By.xpath("//*[@data-test='lastName']"));
        clickPlaceLastNameElement.click();
        clickPlaceLastNameElement.sendKeys("Testowy");

        WebElement clickPlacePostalCodeElement = driver.findElement(By.xpath("//*[@data-test='postalCode']"));
        clickPlacePostalCodeElement.click();
        clickPlacePostalCodeElement.sendKeys("example");

        WebElement clickContinueInCheckoutYourInformationElement = driver.findElement(By.xpath("//*[@data-test='continue']"));
        clickContinueInCheckoutYourInformationElement.click();

        WebElement clickFinishYourShoppingElement = driver.findElement(By.xpath("//*[@data-test='finish']"));
        clickFinishYourShoppingElement.click();

        WebElement clickBackHomeElement = driver.findElement(By.xpath("//*[@data-test='back-to-products']"));
        clickBackHomeElement.click();
    }
}
