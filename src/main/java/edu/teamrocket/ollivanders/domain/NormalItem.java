package edu.teamrocket.ollivanders.domain;

class NormalItem {

    private String name;
    private int sell_in;
    private int quality;

    public NormalItem(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    public String getName() {
        return this.name;
    }

    public int getSell_in() {
        return this.sell_in;
    }

    public int getQuality() {
        return this.quality;
    }

    public void updateQuality() {

        if (this.quality > 0){
            this.quality = this.quality - 1;
        }
    }
}
