package ru.mirea.lab7.n4;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModule(double realPart, double imPart) {
        return Math.sqrt(Math.pow(realPart, 2) + Math.pow(imPart, 2));
    }

    public double calculateCircleLength(double radius) {
        return 2 * PI * radius;
    }

    //testing
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        double circleLength = mathFunc.calculateCircleLength(6.0);
        System.out.println("Длина окружности: " + circleLength);
        double powww = mathFunc.power(4.0, 5.0);
        System.out.println("Степень: " + powww);
    }
}
