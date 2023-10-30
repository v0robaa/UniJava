package ru.mirea.lab5.n2;

import java.awt.*;

public class Square extends Shape{
    private final int side;
    public Square(int posX, int posY, Color color, int side) {
        super(posX, posY, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}