package pages;

import selectors.WebElementSelectorsPage;
import utils.Interactions;
import utils.LoginData;

public class LoginPage extends BasePage implements WebElementSelectorsPage {

    public LoginPage(Interactions driver) {
        super(driver);
    }

    public void sendLoginDataToLogIn() {
        LoginData loginData = new LoginData("davidddan@wp.pl", "Torres12321!");
        driver.sendKeys(emailFieldInLoginPageDraplaSelector, loginData.getEmail());
        driver.sendKeys(passwordFieldInLoginPageDraplaSelector, loginData.getPassword());
    }
    public void sendLoginDataWithEmptyPassword() {
        LoginData loginData = new LoginData("davidddan@wp.pl", " ");
        driver.sendKeys(emailFieldInLoginPageDraplaSelector, loginData.getEmail());
        driver.sendKeys(passwordFieldInLoginPageDraplaSelector, loginData.getPassword());
    }
    public void assertIncorrectPasswordRegexAppear() {
        driver.awaitUntilElementDisplayed(incorrectFieldRegexPasswordSelector);
    }
    public void sendLoginDataWithIncorrectPassword() {
        LoginData loginData = new LoginData("davidddan@wp.pl", "nsadndajsf");
        driver.sendKeys(emailFieldInLoginPageDraplaSelector, loginData.getEmail());
        driver.sendKeys(passwordFieldInLoginPageDraplaSelector, loginData.getPassword());
    }
    public void sendLoginDataWithIncorrectEmail() {
        LoginData loginData = new LoginData("daviddd32432an@wp.pl", "Torres12321!");
        driver.sendKeys(emailFieldInLoginPageDraplaSelector, loginData.getEmail());
        driver.sendKeys(passwordFieldInLoginPageDraplaSelector, loginData.getPassword());

    }
    public void assertIncorrectPasswordAndEmailRegexAppear() {
        driver.awaitUntilElementDisplayed(fieldCheckEmailAndPasswordSelector);
    }
    public void clickOnSignInButton() {
        driver.click(signInButtonInLoginPageDraplaSelector);
    }
}

