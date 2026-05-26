package edu.teamrocket.ollivanders.domain;

public class Backstage extends BaseUpdateableItem {

    public Backstage(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public void updateQuality() {
        if (getSell_in() <= 0) {
            setQuality(0);
        } else if (getSell_in() <= 5) {
            changeQuality(3);
        } else if (getSell_in() <= 10) {
            changeQuality(2);
        } else {
            changeQuality(1);
        }
        setSell_in();
    }
}
