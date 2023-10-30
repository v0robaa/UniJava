package ru.mirea.lab4_1.n1_8;

public class Circle extends Shape{
    double rad;
    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*rad;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(rad, 2);
    }
    public Circle(double rad) {
        this.rad = rad;
    }
}
