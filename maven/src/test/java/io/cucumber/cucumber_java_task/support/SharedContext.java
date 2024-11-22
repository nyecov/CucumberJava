package io.cucumber.cucumber_java_task.support;

import io.cucumber.cucumber_java_task.Item;

import java.util.ArrayList;
import java.util.List;

public class SharedContext {
    private List<Item> firstList = new ArrayList<>();
    private List<Item> secondList = new ArrayList<>();

    public SharedContext() {
    }

    public List<Item> getFirstList() {
        return firstList;
    }

    public void setFirstList(List<Item> firstList) {
        this.firstList = firstList;
    }

    public List<Item> getSecondList() {
        return secondList;
    }

    public void setSecondList(List<Item> secondList) {
        this.secondList = secondList;
    }
}
