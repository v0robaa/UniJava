package ru.mirea.lab3.n2;

public class Circle {
    private Point center;
    private Double rad = 0.0;
    private Double x = 0.0, y = 0.0;
    Circle(Double newx, Double newy, Double radius) {
        x = newx;
        y = newy;
        rad = radius;
    }
    Circle(Point p, Double radius) {
        rad = radius;
        x = p.getX();
        y = p.getY();
    }
    Circle(){};
    public Double getX(){
        return x;
    }
    public Double getY() {
        return y;
    }
    public Double getRad() {
        return rad;
    }
    public void setX(Double newX) {
        x = newX;
    }
    public void setY(Double newY) {
        y = newY;
    }
    public void setXY(Double newX, Double newY) {
        x = newX;
        y = newY;
    }
}
