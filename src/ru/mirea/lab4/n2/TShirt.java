package ru.mirea.lab4.n2;

public class TShirt  extends Clothes implements MenClothing, WomanClothing {

    public TShirt (String colour, Atelier.sizes size, int price) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("T-shirt" + " " + this.getColour() + " " + this.getSize() + " " + getPrice() + "$");
    }
    @Override
    public void dressWoman() {
        System.out.println("T-shirt" + " " + this.getColour() + " " + this.getSize() + " " + getPrice() + "$");
    }
}
