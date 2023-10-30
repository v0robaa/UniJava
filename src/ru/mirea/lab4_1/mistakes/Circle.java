package ru.mirea.lab4_1.mistakes;

public class Circle extends Shape{
    public Circle(Double a, String color, Boolean filled) {
        super(a, color, filled);
    }
    public Double getPerimeter() {
        return Math.PI*a*2;
    }
    public Double getArea() {
        return Math.PI*a*a;
    }
    public Double getRadius() {
        return a;
    }
}
