package examples;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import examples.browser.Browser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "src/test/resources/examples",
        strict = true,
        plugin = {
                "pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        }, tags = {"@great"}
)
public class RunAcceptanceTest {

    @AfterClass
    public static void closeDriver() {
        Browser.close();
    }
}
