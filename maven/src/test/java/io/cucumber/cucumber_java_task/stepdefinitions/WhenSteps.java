package io.cucumber.cucumber_java_task.stepdefinitions;
import io.cucumber.cucumber_java_task.Item;
import io.cucumber.cucumber_java_task.support.SharedContext;
import io.cucumber.java.en.When;

import java.util.List;

public class WhenSteps {

    private final SharedContext sharedContext;

    public WhenSteps(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
    }

    @When("I compare both lists")
    public void iCompareBothLists() {
        List<Item> firstList = sharedContext.getFirstList();
        List<Item> secondList = sharedContext.getSecondList();

        for (Item item : firstList) {
            if (!secondList.contains(item)) {
                System.out.println("Discrepancy: Item in first list not found in second list: " + item);
            }
        }

        for (Item item : secondList) {
            if (!firstList.contains(item)) {
                System.out.println("Discrepancy: Item in second list not found in first list: " + item);
            }
        }

    }
}
