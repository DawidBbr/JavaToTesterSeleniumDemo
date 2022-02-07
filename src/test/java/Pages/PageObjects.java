package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageObjects {

    private final WebDriverWait wait;
    private final Actions changeSizeOfDressToM;

    public PageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        changeSizeOfDressToM = new Actions(driver);
    }

    @FindBy(xpath = "//*[@id='search_query_top']")
    WebElement writeWomenInSearchBox;

    @FindBy(xpath = "//*[@name='submit_search']")
    WebElement searchWomenInSearchBox;

    @FindBy(xpath = "//*[@src='http://automationpractice.com/img/p/1/0/10-small_default.jpg']")
    WebElement chooseDressFromSearchList;

    @FindBy(xpath = "//*[@class='color_pick']")
    WebElement changeColorOfDress;

    @FindBy(xpath = "//*[@class='span_link no-print']")
    WebElement enlargePhotoOfDress;

    @FindBy(xpath = "//*[@class='fancybox-item fancybox-close']")
    WebElement closeEnlargePhotoOfDress;

    @FindBy(xpath = "//*[@name='group_1']")
    WebElement changeSizeOfDress;

    @FindBy(xpath = "//*[@value='2']")
    WebElement chooseDressWithMSize;

    @FindBy(xpath = "//*[@class='exclusive']")
    WebElement buyDressOfYourChoice;

    @FindBy(xpath = "//*[@class='exclusive added']")
    WebElement buySecondDressOfYourChoice;

    @FindBy(xpath = "//*[@class='icon-chevron-left left']")
    WebElement continueShopping;

    @FindBy(xpath = "//*[@title='Contact Us']")
    WebElement contactUs;

    public void inputWomenInSearchBoxElement(){
        writeWomenInSearchBox.sendKeys("women");
    }

    public void afterInputValueInSearchBoxClickInSearchElement() {
        searchWomenInSearchBox.click();
    }

    public void chooseDreesLastOnTheListElement() {
        wait.until(ExpectedConditions.visibilityOf(chooseDressFromSearchList));
        chooseDressFromSearchList.click();
    }

    public void changeColorOfDressOnPink() {
        wait.until(ExpectedConditions.visibilityOf(changeColorOfDress));
        changeColorOfDress.click();
    }

    public void clickOnTheDressToSeeItInLargePhoto() {
        enlargePhotoOfDress.click();
    }
    public void closeLargePhotoWithYourChosenDress() {
        wait.until(ExpectedConditions.visibilityOf(closeEnlargePhotoOfDress));
        closeEnlargePhotoOfDress.click();
    }

    public void clickOnSizeSelectionToChangeSizeOfDress() {
        changeSizeOfDressToM.clickAndHold(changeSizeOfDress).build().perform();
    }

    public void chooseSizeMOfDressFromOtherSizes() {
        chooseDressWithMSize.click();
    }

    public void addSelectedDressToShoppingCart() {
        buyDressOfYourChoice.click();
    }

    public void clickInContinueShoppingButton() {
        wait.until(ExpectedConditions.visibilityOf(continueShopping));
        continueShopping.click();
    }

    public void addSecondSelectedDressToShoppingCart() {
        buySecondDressOfYourChoice.click();
    }
    public void clickOnContactUsLinkInHomePage() {
        contactUs.click();
    }
}

