package edu.teamrocket.ollivanders.domain;

import java.util.ArrayList;
import java.util.List;

public class Ollivanders {

    private final List<Updateable> items = new ArrayList<>();

    public void addItem(Updateable item) {
        this.items.add(item);
    }

    public void updateQuality() {
        for (Updateable item : items) {
            item.updateQuality();
        }
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
