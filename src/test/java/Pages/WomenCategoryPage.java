package Pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class WomenCategoryPage extends BasePage {

    private final WebDriverWait wait;

    public WomenCategoryPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//div[@class='right-block']//span[@class='price product-price']")
    List<WebElement> listOfProductForWomen;

    public void getProductForWomen() {
        List<Double> listOfPricesAllProduct = listOfProductForWomen.stream()
                .map(e -> e.getText().trim())
                .filter(e -> e.contains("$"))
                .map(e -> e.replace("$", " "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (Double pricesOfProducts : listOfPricesAllProduct) {
            Assertions.assertThat(pricesOfProducts).isGreaterThan(0);
        }
        for (Double list : listOfPricesAllProduct) System.out.println(list);
    }
}
