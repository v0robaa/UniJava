package ru.mirea.lab5.n2;

import java.awt.*;
public class Rectangle extends Shape{
    private int sideA, sideB;
    public Rectangle(int posX, int posY, Color color, int side1, int side2) {
        super(posX, posY, color);
        this.sideB = side2;
        this.sideA = side1;
    }

    public int getSide1() {
        return sideA;
    }

    public int getSide2() {
        return sideB;
    }
}
