package ru.mirea.lab4_1.n1_8;

public class Test {
    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(2.0, 4.0), new Square(4.0, 4.0)};
        System.out.println(arr[0].getType() + " " + arr[0].getArea() + " " + arr[0].getPerimeter());
        System.out.println(arr[1].getType() + " " + arr[1].getArea() + " " + arr[1].getPerimeter());
        System.out.println(arr[2].getType() + " " + arr[2].getArea() + " " + arr[2].getPerimeter());
    }
}
