package examples.steps;

import cucumber.api.java.en.Given;

import java.util.List;

public class UserStepsDef {
    @Given("^some users$")
    public void givenSomeUsers(List<User> users) throws Throwable {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
