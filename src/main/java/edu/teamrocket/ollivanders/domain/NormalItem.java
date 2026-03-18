package edu.teamrocket.ollivanders.domain;

class NormalItem {

    private String name;
    private int sell_in;
    private int quality;

    private final Item item;

    public NormalItem(String name, int sell_in, int quality) {
        this.item = new Item(name, sell_in, quality);
        
    }

    Item getItem(){
        return this.item;
    }

    public String getName() {
        return this.name;
    }

    public int getSell_in() {
        return this.sell_in;
    }

    void setSell_in(int sell_in) {
        this.sell_in = sell_in;
    }

    public int getQuality() {
        return this.quality;
    }

    void computeQuality(int value){
        if (getQuality() + value > 50){
            item.setQuality(50);
        } else if (getQuality() + value >= 0){
            item.setQuality(value);
        } else { item.setQuality(0);}

    }
    
    @Override
    public void updateQuality() {

        if (this.quality > 0){
            this.quality -= 1;
        } else {
            this.quality -= 2;
        }
        setSell_in();
    }
}
