package ru.mirea.lab2.n6;

public class Circle {
    private double r;

    Circle(double r)
    {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getArea()
    {
        return (Math.PI * r*r);
    }

    public double getLength()
    {
        return (2 * Math.PI * r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
