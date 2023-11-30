package examples.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import examples.browser.Browser;
import examples.pages.GoogleHomePage;
import examples.pages.GoogleResultPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class GoogleSearchDef extends Browser {
    @Given("^I opened Google Page$")
    public void iOpenedGooglePage() {
        new GoogleHomePage().open();
    }

    @Given("^I opened Google Page Second$")
    public void iOpenedGooglePageSecond() {
        new GoogleHomePage().openSecond();
    }

    @When("^I search the product \"([^\"]*)\"$")
    public void iSearchTheProduct(String query) {
        new GoogleHomePage().enterQuery(query).clickSubmit();
    }

    @Then("^the term query \"([^\"]*)\" should be the first in the Search Result grid$")
    public void theTermQueryShouldBeTheFirstInTheSearchResultGrid(String expectPhrase) {
        assertThat(new GoogleResultPage().getTextFromFirstProduct(), containsString(expectPhrase));
    }
}
