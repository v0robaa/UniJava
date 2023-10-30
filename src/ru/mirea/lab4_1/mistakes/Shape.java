package ru.mirea.lab4_1.mistakes;

public abstract class Shape {
    public Double a, b;
    String color;
    Boolean filled;
    public String getColor() {
        return color;
    }

    public Boolean isFilled() {
        return filled;
    }
    public abstract Double getPerimeter();
    public abstract Double getArea();
    public Shape(Double a, Double b, String color, Boolean filled) {
        this.a = a;
        this.b = b;
        this.color = color;
        this.filled = filled;
    }
    public Shape(Double a, String color, Boolean filled) {
        this.a = a;
        this.color = color;
        this.filled = filled;
    }

}
