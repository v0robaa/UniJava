package ru.mirea.lab4_1.n1_8;

public class Square extends Shape {
    double a, b;


    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }
    public Square(Double a, Double b) {
        this.a = a;
        this.b = b;
    }
}
