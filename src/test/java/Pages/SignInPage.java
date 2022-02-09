package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage extends BasePage{

    private final WebDriverWait wait;
    Faker faker = new Faker();
    String fakeEmail = faker.internet().emailAddress();

    public SignInPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//*[@id='email_create']")
    WebElement addressEmailBox;
    @FindBy(xpath = "//*[@id='SubmitCreate']")
    WebElement buttonCreateAnAccount;

    public void inputValidEmailToAddressEmailBox() {
        wait.until(ExpectedConditions.visibilityOf(addressEmailBox));
        addressEmailBox.sendKeys(fakeEmail);
    }
     public void clickOnButtonCreateAnAccount(){
        buttonCreateAnAccount.click();
    }
}
