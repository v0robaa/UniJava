package ru.mirea.lab2.n3;

public class Tester
{
    private Circle[] circles;
    private int counter;

    public Tester(int maxSize)
    {
        circles = new Circle[maxSize];
        counter = 0;
    }

    public void addCircle(Circle new_circle) {
        if (counter < circles.length)
        {
            circles[counter] = new_circle;
            counter++;
        }
        else
        {
            System.out.println("Массив полон, невозможно добавить новый элемент.");
        }
    }

    public void printCircles() {
        for (int i = 0; i < counter; i++) {
            Circle circle = circles[i];
            Point center = circle.getCenter();
            double radius = circle.getRadius();
            System.out.println("Окружность " + (i + 1) + ": центр (" + center.getX() + ", " + center.getY() + "), радиус " + radius);
        }
        System.out.println("Кол-во окружностей: " + counter);
    }

    public static void main(String[] args) {
        Tester test = new Tester(4);

        Point center1 = new Point(1, 1);
        Circle circle1 = new Circle(center1, 2.5);
        test.addCircle(circle1);

        Point center2 = new Point(-2, 3);
        Circle circle2 = new Circle(center2, 4.0);
        test.addCircle(circle2);

        Point center3 = new Point(7, 12);
        Circle circle3 = new Circle(center2, 6.0);
        test.addCircle(circle3);

        test.printCircles();
    }
}

