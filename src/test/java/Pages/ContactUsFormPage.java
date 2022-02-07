package Pages;

import model.Message;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsFormPage extends BasePage {

    //    private Select subject;
    private final WebDriverWait wait;

    public ContactUsFormPage(WebDriver driver) {
        super(driver);
//        subject = new Select(subjectSelect);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//*[@id='submitMessage']")
    WebElement sendButton;

    @FindBy(xpath = "//*[@name='id_contact']")
    WebElement subjectSelect;

    @FindBy(xpath = "//*[@class='form-control grey validate']")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@class='form-control grey']")
    WebElement orderReference;

    @FindBy(xpath = "//*[@id='message']")
    WebElement placeForMessage;

    @FindBy(xpath = "//*[@class='alert alert-danger']")
    WebElement redAlertBoxIndicatingFail;

    @FindBy(xpath = "//*[@class='alert alert-success']")
    WebElement greenAlertBoxIndicatingSuccess;

    @FindBy(xpath = "//*[@value='1']")
    WebElement choseWebmasterFromDropDownSubjectSelect;

    public boolean isRedAlertBoxDisplayed() {
        return isAlertBoxDisplayed(redAlertBoxIndicatingFail);
    }

    public boolean isGreenAlertBoxDisplayed() {
        return isAlertBoxDisplayed(greenAlertBoxIndicatingSuccess);
    }

    public boolean isAlertBoxDisplayed(WebElement box) {
        wait.until(ExpectedConditions.visibilityOf(box));
        boolean isDisplayed = false;
        try {
            isDisplayed = box.isDisplayed();
        } catch (NoSuchElementException e) {
        }
        return isDisplayed;
    }

    public void sendContactUsFormWithValidData(Message message) {
//        wait.until(ExpectedConditions.visibilityOf(subjectSelect));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='id_contact']")));
//        Select subject = new Select(subjectSelect);
//        subject.selectByVisibleText(message.getSubject().getValue());
        subjectSelect.click();
        choseWebmasterFromDropDownSubjectSelect.click();

        emailAddress.sendKeys(message.getEmail());
        orderReference.sendKeys(message.getOrderReference());
        placeForMessage.sendKeys(message.getMessage());
        sendButton.click();
    }
}
