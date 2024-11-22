package io.cucumber.cucumber_java_task.stepdefinitions;

import io.cucumber.cucumber_java_task.Item;
import io.cucumber.cucumber_java_task.support.SharedContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




public class GivenSteps {
    private SharedContext sharedContext;

    private List<Item> firstList = new ArrayList<>();
    private List<Item> secondList = new ArrayList<>();

    public GivenSteps(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
    }

    @Given("I have the following items in the first list:")
    public void iHaveTheFollowingItemsInTheFirstList(DataTable dataTable) {
        List<Item> firstList = dataTable.asMaps(String.class, String.class).stream()
                .map(row -> new Item(
                        row.get("name"),
                        Double.parseDouble(row.get("price")),
                        row.get("category")
                ))
                .collect(Collectors.toList());
        sharedContext.setFirstList(firstList);
    }

    @Given("I have the following items in the second list:")
    public void iHaveTheFollowingItemsInTheSecondList(DataTable dataTable) {
        List<Item> secondList = dataTable.asMaps(String.class, String.class).stream()
                .map(row -> new Item(
                        row.get("name"),
                        Double.parseDouble(row.get("price")),
                        row.get("category")
                ))
                .collect(Collectors.toList());
        sharedContext.setSecondList(secondList);
    }
}
