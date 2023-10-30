package ru.mirea.lab5.n2;
import java.awt.*;

public abstract class Shape {
    private final Color color;
    private final int posX;
    private final int posY;
    Shape(int posX, int posY, Color color) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Color getColor() {
        return color;
    }
}

