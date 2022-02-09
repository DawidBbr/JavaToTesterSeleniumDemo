package Pages;

import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.YearOfBirth;
import model.YourPersonalInformation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class CreateAccountPage extends BasePage {

    private final WebDriverWait wait;
    private WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//*[@id='id_gender1']")
    WebElement choseYourGender;
    @FindBy(xpath = "//*[@id='customer_firstname']")
    WebElement firstNamePersonalField;
    @FindBy(xpath = "//*[@id='customer_lastname']")
    WebElement lastNamePersonalField;
    @FindBy(xpath = "//*[@id='passwd']")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id='days']")
    WebElement dayOfBirth;
    @FindBy(xpath = "//*[@id='months']")
    WebElement monthOfBirth;
    @FindBy(xpath = "//*[@id='years']")
    WebElement yearOfBirth;
    @FindBy(xpath = "//*[@id='uniform-newsletter']")
    WebElement signUpForOurNewsletterField;
    @FindBy(xpath = "//*[@id='optin']")
    WebElement receiveSpecialOffersFromOurPartners;

    @FindBy(xpath = "//*[@id='submitAccount']")
    WebElement registerButton;
    @FindBy(xpath = "//*[@class='alert alert-success']")
    WebElement greenAlertAboutSuccessCreateAccount;

    public boolean isGreenAlertBoxDisplayed() {
        return isSuccessAlertBoxDisplayed(greenAlertAboutSuccessCreateAccount);
    }

    public boolean isSuccessAlertBoxDisplayed(WebElement webelement) {
        wait.until(ExpectedConditions.visibilityOf(webelement));
        boolean isDisplayed = false;
        try {
            isDisplayed = webelement.isDisplayed();
        } catch (NoSuchElementException e) {
        }
        return isDisplayed;
    }

    public void inputValidLogInInformation(YourPersonalInformation yourPersonalInformation) {
        wait.until(ExpectedConditions.visibilityOf(choseYourGender));

        choseYourGender.click();
        firstNamePersonalField.sendKeys(yourPersonalInformation.getFirstName());
        lastNamePersonalField.sendKeys(yourPersonalInformation.getLastName());
        passwordField.sendKeys(yourPersonalInformation.getPassword());
//        signUpForOurNewsletterField.click();
        receiveSpecialOffersFromOurPartners.click();

        dayOfBirth.click();
        driver.findElement(selectDayFromDropDown(yourPersonalInformation.getDayOfBirth())).click();
        monthOfBirth.click();
        driver.findElement(selectMonthFromDropDown(yourPersonalInformation.getMonthOfBirth())).click();
        yearOfBirth.click();
        driver.findElement(selectYearFromDropDown(yourPersonalInformation.getYearOfBirth())).click();
        registerButton.click();
    }

    public By selectDayFromDropDown(DayOfBirth day) {
        return (By.xpath("//*[@id='days']//*[@value='"+ day.getName() +"']"));
    }
    public By selectMonthFromDropDown(MonthOfBirth month) {
        return (By.xpath("//*[@id='months']//*[@value='"+ month.getName() + "']"));
    }
    public By selectYearFromDropDown(YearOfBirth year) {
        return (By.xpath("//*[@id='years']//*[@value='" + year.getName() + "']"));
    }
}


