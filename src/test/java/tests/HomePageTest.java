package tests;

import Pages.*;
import enums.DayOfBirth;
import enums.MonthOfBirth;
import enums.YearOfBirth;
import model.YourPersonalInformation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageTest extends BaseTest {

    private PageObjects productFromWomenCategory;
    private WomenCategoryPage listOfProductForWomen;
    private PageObjects inputValueInSearchingBox;
    private BlousePage blousePage;
    private PageObjects goToSignIn;
    private SignInPage addressEmailBox;
    private SignInPage buttonCreateAnAccount;
    private CreateAccountPage createAccountPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        productFromWomenCategory = new PageObjects(driver);
        listOfProductForWomen = new WomenCategoryPage(driver);
        inputValueInSearchingBox = new PageObjects(driver);
        blousePage = new BlousePage(driver);
        goToSignIn = new PageObjects(driver);
        addressEmailBox = new SignInPage(driver);
        buttonCreateAnAccount= new SignInPage(driver);
        createAccountPage = new CreateAccountPage(driver);
    }

    @Test
    public void shouldReturnListProductAfterClickWomanCategories() {
        productFromWomenCategory.shouldReturnListOfProductForWomen();
        listOfProductForWomen.getProductForWomen();
    }

    @Test
    public void shouldReturnSearchingBlouseWithValidData() {
        inputValueInSearchingBox.shouldReturnBlouseAfterInputValueInSearchingBox();
        blousePage.shouldReturnValidDataAboutBlouseAfterSearching();
        Assertions.assertThat(blousePage.shouldReturnCorrectTitleOfProduct()).isTrue();
        Assertions.assertThat(blousePage.shouldReturnCorrectPriceOfProduct()).isTrue();
        Assertions.assertThat(blousePage.shouldReturnOneElementAfterSearching()).isTrue();
    }

    @Test
    public void shouldReturnCreateAccountAfterInputValidData() {
        goToSignIn.clickOnSignInElementAndGoToTarget();
        addressEmailBox.inputValidEmailToAddressEmailBox();
        buttonCreateAnAccount.clickOnButtonCreateAnAccount();
        YourPersonalInformation yourPersonalInformation = new YourPersonalInformation("Dawid", "Testowy",
                "secret", DayOfBirth.DAY8,MonthOfBirth.DECEMBER, YearOfBirth.BORNIN1994);

        createAccountPage.inputValidLogInInformation(yourPersonalInformation);
        Assertions.assertThat(createAccountPage.isGreenAlertBoxDisplayed()).isTrue();
    }
}