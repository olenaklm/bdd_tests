package examples.steps;

import cucumber.api.Format;
import cucumber.api.java.en.Given;

import java.util.Date;

public class ExampleStepsDef {
    @Given("^some number value '(.*)'")
    public void givenNumber(double number) {
        System.out.println(number);
    }

    @Given("^another number value '(\\d+)'$")
    public void another_number_value(int number) {
        System.out.println("another " + number);
    }

    @Given("^some string value '(.*)'")
    public void givenString(String str) {
        System.out.println(str);
    }

    @Given("^some date value (.*)")
    public void givenDate(@Format("dd.MM.yyyy") Date date) {
        System.out.println(date);
    }
}
