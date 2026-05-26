package edu.teamrocket.ollivanders.domain;

public class Conjured extends BaseUpdateableItem {

    public Conjured(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() > 0) {
            changeQuality(-2);
        } else {
            changeQuality(-4);
        }
        setSell_in();
    }
}
