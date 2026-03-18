package edu.teamrocket.ollivanders;

public class Item {

    private String name;
    private int sell_in;
    private int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    public String getName() {
        return this.name;
    }

    public int getQuality() {
        return quality;
    }

    public int getSell_in() {
        return sell_in;
    }

    @Override
    public String toString() {
        return name + ", " + sell_in + ", " + quality;
    }
}