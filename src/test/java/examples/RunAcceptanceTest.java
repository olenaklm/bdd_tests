package examples;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/examples",
        glue = {"examples/steps"},
//        strict = false,
//        dryRun = true,
        snippets = SnippetType.CAMELCASE,
        plugin = {
                "pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
//       }
//        },
//        tags = {"@great"}
//        }, tags = {"@Smoke"}
        }, tags = {"@IndefiniteStep"}
)
public class RunAcceptanceTest {

//    @AfterClass
//    public static void closeDriver() {
//        Browser.close();
//    }
}
