package edu.teamrocket.ollivanders.domain;

public class AgedBrie extends BaseUpdateableItem {

    public AgedBrie(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() > 0) {
            changeQuality(1);
        } else {
            changeQuality(2);
        }
        setSell_in();
    }
}
