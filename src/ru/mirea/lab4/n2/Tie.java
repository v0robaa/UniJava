package ru.mirea.lab4.n2;

public class Tie extends Clothes implements MenClothing {
    public Tie (String colour, Atelier.sizes size, int price) {
        super(size, price, colour); //обращение к родителю
    }
    @Override
    public void dressMan() {
        System.out.println("Tie" + " " + this.getColour() + " " + this.getSize() + " " + getPrice() + "$");
    }
}