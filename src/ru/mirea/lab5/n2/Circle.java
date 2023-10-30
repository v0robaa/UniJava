package ru.mirea.lab5.n2;

import javax.swing.*;
import java.awt.*;

public class Circle extends Shape{
    private int rad;
    Circle(int posX, int posY, Color  color, int rad) {
        super(posX, posY, color);
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

}
