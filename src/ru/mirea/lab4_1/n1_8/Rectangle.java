package ru.mirea.lab4_1.n1_8;

public class Rectangle extends Shape{
    private double a, b;
    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return a*b/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+Math.sqrt(a*a+b*b);
    }
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
