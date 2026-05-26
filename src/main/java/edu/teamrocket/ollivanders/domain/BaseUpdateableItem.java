package edu.teamrocket.ollivanders.domain;

public abstract class BaseUpdateableItem implements Updateable {

    private final Item item;

    protected BaseUpdateableItem(String name, int sell_in, int quality) {
        this.item = new Item(name, sell_in, quality);
    }

    @Override
    public String toString() {
        return item.toString();
    }

    public String getName() {
        return item.getName();
    }

    public int getSell_in() {
        return item.getSell_in();
    }

    protected void setSell_in() {
        item.setSell_in();
    }

    public int getQuality() {
        return item.getQuality();
    }

    protected void setQuality(int value) {
        item.setQuality(value);
    }

    protected void changeQuality(int delta) {
        int nextQuality = item.getQuality() + delta;
        if (nextQuality > 50) {
            nextQuality = 50;
        }
        if (nextQuality < 0) {
            nextQuality = 0;
        }
        item.setQuality(nextQuality);
    }
}
