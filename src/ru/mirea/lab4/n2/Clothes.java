package ru.mirea.lab4.n2;

public class Clothes {
    public String colour;
    public int price;
    public Atelier.sizes size;
    public Clothes(Atelier.sizes size, int price, String colour) {
        this.size = size;
        this.colour = colour;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public Atelier.sizes getSize() {
        return size;
    }
    public String getColour() {
        return colour;
    }
}
