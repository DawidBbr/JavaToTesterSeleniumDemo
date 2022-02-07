package tests;

import Pages.ContactUsFormPage;
import Pages.PageObjects;
import enums.MessageSubject;
import model.Message;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

import static org.assertj.core.api.Assertions.*;


public class HomePageTest extends BaseTest {

    private PageObjects writeWomenInSearchBox;
    private PageObjects searchWomenInSearchBox;
    private PageObjects chooseDressFromSearchList;
    private PageObjects changeColorOfDress;
    private PageObjects enlargePhotoOfDress;
    private PageObjects closeEnlargePhotoOfDress;
    private PageObjects changeSizeOfDress;
    private PageObjects chooseDressWithMSize;
    private PageObjects buyDressOfYourChoice;
    private PageObjects continueShopping;
    private PageObjects buySecondDressOfYourChoice;
    private PageObjects contactUs;
    private ContactUsFormPage contactUsFormPage;

    @BeforeEach
    public void setupTest() {

        driver = new ChromeDriver();
        driver.get(BASE_URL);
        writeWomenInSearchBox = new PageObjects(driver);
        searchWomenInSearchBox = new PageObjects(driver);
        chooseDressFromSearchList = new PageObjects(driver);
        changeColorOfDress = new PageObjects(driver);
        enlargePhotoOfDress = new PageObjects(driver);
        closeEnlargePhotoOfDress = new PageObjects(driver);
        changeSizeOfDress = new PageObjects(driver);
        chooseDressWithMSize = new PageObjects(driver);
        buyDressOfYourChoice = new PageObjects(driver);
        continueShopping = new PageObjects(driver);
        buySecondDressOfYourChoice = new PageObjects(driver);
        contactUs = new PageObjects(driver);
        contactUsFormPage = new ContactUsFormPage(driver);
    }

    @Test
    public void checkCanIBuyWomenClothesAndDelete() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        writeWomenInSearchBox.inputWomenInSearchBoxElement();
        searchWomenInSearchBox.afterInputValueInSearchBoxClickInSearchElement();
        chooseDressFromSearchList.chooseDreesLastOnTheListElement();
        changeColorOfDress.changeColorOfDressOnPink();
        enlargePhotoOfDress.clickOnTheDressToSeeItInLargePhoto();
        closeEnlargePhotoOfDress.closeLargePhotoWithYourChosenDress();
        changeSizeOfDress.clickOnSizeSelectionToChangeSizeOfDress();
        chooseDressWithMSize.chooseSizeMOfDressFromOtherSizes();
        buyDressOfYourChoice.addSelectedDressToShoppingCart();
        continueShopping.clickInContinueShoppingButton();
        buySecondDressOfYourChoice.addSecondSelectedDressToShoppingCart();
        continueShopping.clickInContinueShoppingButton();

        WebElement clickInCartElementAndGoToCheckMyShoppingCart = driver.findElement(By.xpath("//*[@name='group_1']"));
        Actions checkShoppingCart = new Actions(driver);
        checkShoppingCart.clickAndHold(clickInCartElementAndGoToCheckMyShoppingCart).build().perform();
        checkShoppingCart.moveToElement(driver.findElement(By.xpath("//*[@class='block_content']")));

        WebElement clickInCheckMyShoppingCart = driver.findElement(By.xpath("//*[@class='block_content']"));
        clickInCheckMyShoppingCart.click();

        WebElement checkIfSelectedDressIsInTheShoppingCart = driver.findElement(By.xpath("//*[@class='table table-bordered stock-management-on']"));
        assertThat(checkIfSelectedDressIsInTheShoppingCart.isDisplayed()).isTrue();
    }

    @Test
    public void shouldReturnInfoAboutPositiveSendContactUsFormWithValidData() {
//        WebElement clickInContactUsElementInHomePage = driver.findElement(By.xpath("//*[@title='Contact Us']"));
//        clickInContactUsElementInHomePage.click();
        contactUs.clickOnContactUsLinkInHomePage();
        Message message = new Message(MessageSubject.WEBMASTER, "dawid@test.com",
                "123", "Message attached to the sent form" );

        contactUsFormPage.sendContactUsFormWithValidData(message);
//        WebElement clickInContactUsElementInHomePage = driver.findElement(By.xpath("//*[@title='Contact Us']"));
//        clickInContactUsElementInHomePage.click();
        Assertions.assertThat(contactUsFormPage.isGreenAlertBoxDisplayed()).isTrue();
    }
}


