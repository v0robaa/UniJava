package ru.mirea.lab2.n6;

public class CircleTest {
    public static void main(String[] args)
    {
        Circle cir1 = new Circle(3);
        Circle cir2 = new Circle(3);

        if (cir1.getR() > cir2.getR())
        {
            System.out.println("Площадь первой окружности: " + cir1.getArea() + ", она больше площади второй окружности: " +  cir2.getArea());
            System.out.println("Длина первой окружности: " + cir1.getLength() + ", она больше длины второй окружности: " +  cir2.getLength());
        }
        else if (cir1.getR() == cir2.getR())
        {
            System.out.println("Площади окружностей равны: " + cir1.getArea());
            System.out.println("Длина окружностей равны: " + cir1.getLength());
        }
        else
        {
            System.out.println("Площадь второй окружности: " + cir2.getArea() + ", она больше площади первой окружности: " +  cir1.getArea());
            System.out.println("Длина второй окружности: " + cir2.getLength() + ", она больше длины первой окружности: " +  cir1.getLength());
        }
    }
}
