package examples.pages;

import org.openqa.selenium.By;

public class GoogleHomePage extends AbstractPage {
    private static final String BASE_URL = "https://www.google.by/";
    private final By searchInput = By.xpath(".//*[@type='search']");
    private final By submit = By.xpath("//*[@type='submit'][@name='btnK']");

    public GoogleHomePage open() {
        driver.get(BASE_URL);
        return this;
    }

    public GoogleHomePage enterQuery(String query) {
        waitForElementVisible(searchInput);
        driver.findElement(searchInput).sendKeys(query);
        return new GoogleHomePage();
    }

    public GoogleResultPage clickSubmit() {
        waitForElementVisible(submit);
        driver.findElement(submit).click();
        return new GoogleResultPage();
    }
}
