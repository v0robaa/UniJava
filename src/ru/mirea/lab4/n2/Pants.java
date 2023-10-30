package ru.mirea.lab4.n2;

public class Pants extends Clothes implements MenClothing, WomanClothing {
    public Pants (String colour, Atelier.sizes size, int price) {
        super(size, price, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Pants" + " " + this.getColour() + " " + this.getSize() + " " + getPrice() + "$");
    }

    @Override
    public void dressWoman() {
        System.out.println("Pants" + " " + this.getColour() + " " + this.getSize() + " " + getPrice() + "$");
    }
}
