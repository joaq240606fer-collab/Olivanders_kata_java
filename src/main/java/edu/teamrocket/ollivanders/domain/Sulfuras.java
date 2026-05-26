package edu.teamrocket.ollivanders.domain;

public class Sulfuras extends BaseUpdateableItem {

    public Sulfuras(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        // Sulfuras never decreases in quality and never has to be sold.
    }
}
