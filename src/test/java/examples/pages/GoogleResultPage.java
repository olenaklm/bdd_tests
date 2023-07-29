package examples.pages;

import org.openqa.selenium.By;

public class GoogleResultPage extends AbstractPage {
//    private final By listImagesOfProducts = By.xpath(".//*[@id='search']//h3/a");
    private final By listOfProducts = By.xpath(".//*[@id='search']//h3");

    public GoogleProductPage clickOnFirstProduct() {
        driver.findElements(listOfProducts).get(0).click();
        return new GoogleProductPage();
    }

    public String getTextFromFirstProduct() {
        return driver.findElements(listOfProducts).get(0).getText();
    }
}
