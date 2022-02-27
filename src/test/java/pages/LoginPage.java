package pages;

import selectors.WebElementSelectorsPage;
import org.openqa.selenium.WebDriver;
import utils.LoginData;

import static utils.Interactions.*;

public class LoginPage extends BasePage implements WebElementSelectorsPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendLoginDataToLogIn() {
        LoginData loginData = new LoginData("davidddan@wp.pl", "Torres12321!");
        sendKeys(driver, emailFieldInLoginPageDraplaSelector, loginData.getEmail());
        sendKeys(driver, passwordFieldInLoginPageDraplaSelector, loginData.getPassword());
    }
    public void clickOnSignInButton() {
        click(driver, signInButtonInLoginPageDraplaSelector);
    }

}

