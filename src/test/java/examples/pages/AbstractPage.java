package examples.pages;

import examples.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    protected WebDriver driver = Browser.getWebDriverInstance();

    public void waitForElementVisible(By locator){
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
