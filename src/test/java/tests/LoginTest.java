package tests;

import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void shouldNotLogInAfterFillEmptyPassword() {
        loginPage.sendLoginDataWithEmptyPassword();
        loginPage.assertIncorrectPasswordRegexAppear();
    }

    @Test
    public void shouldNotLogInAfterFillIncorrectPassword() {
        loginPage.sendLoginDataWithIncorrectPassword();
        loginPage.clickOnSignInButton();
        loginPage.assertIncorrectPasswordAndEmailRegexAppear();
    }

    @Test
    public void shouldNotLogInAfterFillIncorrectEmail() {
        loginPage.sendLoginDataWithIncorrectEmail();
        loginPage.clickOnSignInButton();
        loginPage.assertIncorrectPasswordAndEmailRegexAppear();
    }
}
