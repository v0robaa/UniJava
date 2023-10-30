package ru.mirea.lab4_1.mistakes;

public class Rectangle extends Shape{
    public Double getLength() {
        return Math.sqrt(a*a+b+b);
    }

    @Override
    public Double getPerimeter() {
        return getLength()+a+b;
    }

    @Override
    public Double getArea() {
        return a*b/2;
    }
    public Rectangle(Double a, Double b, String color, Boolean filled) {
        super(a, b, color, filled);
    }
}
