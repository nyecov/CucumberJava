package io.cucumber.cucumber_java_task.stepdefinitions;
import io.cucumber.cucumber_java_task.Item;
import io.cucumber.cucumber_java_task.support.SharedContext;
import io.cucumber.java.en.Then;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThenSteps {

    private final SharedContext sharedContext;

    public ThenSteps(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
    }

    @Then("the lists should contain the same items with name, price, and category, regardless of order")
    public void theListsShouldContainTheSameItems() {
        List<Item> firstList = sharedContext.getFirstList();
        List<Item> secondList = sharedContext.getSecondList();

        assertTrue(firstList.size() == secondList.size(), "Lists do not have the same size");

        /*for (int i = 0; i < firstList.size(); i++) {
            Item firstItem = firstList.get(i);
            Item secondItem = secondList.get(i);

            if (!firstItem.getName().equals(secondItem.getName())) {
                System.out.println("Discrepancy in name for item " + i + ": '" + firstItem.getName() + "' vs '" + secondItem.getName() + "'");
            }

            if (firstItem.getPrice() != secondItem.getPrice()) {
                System.out.println("Discrepancy in price for item " + i + ": " + firstItem.getPrice() + " vs " + secondItem.getPrice());
            }

            if (!firstItem.getCategory().equals(secondItem.getCategory())) {
                System.out.println("Discrepancy in category for item " + i + ": '" + firstItem.getCategory() + "' vs '" + secondItem.getCategory() + "'");
            }
        }*/

        for (Item item : firstList) {
            assertTrue(secondList.contains(item), "Item missing in second list: " + item);
        }

        for (Item item : secondList) {
            assertTrue(firstList.contains(item), "Item missing in first list: " + item);
        }
    }
}
