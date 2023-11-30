package examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleHomePage extends AbstractPage {
//    private static final String BASE_URL = "https://www.google.by/";
    private static final String BASE_URL = "https://www.google.com/?hl=en-US";
    private final By searchInput = By.xpath(".//*[@type='search']");
    private final By submit = By.xpath("//*[@type='submit'][@name='btnK']");

    public GoogleHomePage open() {
        driver.get(BASE_URL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Accept all']"))).click();
        return this;
    }

    public GoogleHomePage openSecond() {
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
