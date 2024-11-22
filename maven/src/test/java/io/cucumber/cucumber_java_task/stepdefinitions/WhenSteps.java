package io.cucumber.cucumber_java_task.stepdefinitions;
import io.cucumber.cucumber_java_task.support.SharedContext;
import io.cucumber.java.en.When;

public class WhenSteps {

    private final SharedContext sharedContext;

    public WhenSteps(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
    }

    @When("I compare both lists")
    public void iCompareBothLists() {
        // Optional: Add any logic here if needed for intermediate steps
    }
}
