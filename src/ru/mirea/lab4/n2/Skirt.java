package ru.mirea.lab4.n2;

public class Skirt extends Clothes implements WomanClothing {
    public Skirt (String colour, Atelier.sizes size, int price) {
        super(size, price, colour);
    }
    @Override
    public void dressWoman() {
        System.out.println("Skirt" + " " + this.getColour() + " " + this.getSize() + " " + getPrice() + "$");

    }
}