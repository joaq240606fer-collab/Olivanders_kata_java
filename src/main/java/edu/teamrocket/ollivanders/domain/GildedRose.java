package edu.teamrocket.ollivanders.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private final List<Updateable> items = new ArrayList<>();

    public void addItem(Updateable item) {
        this.items.add(item);
    }

    public void updateQuality() {
        for (Updateable item : items) {
            item.updateQuality();
        }
    }

    public List<Updateable> inventory() {
        return List.copyOf(this.items);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Updateable item : items) {
            builder.append(item.toString()).append(System.lineSeparator());
        }
        return builder.toString();
    }
}
