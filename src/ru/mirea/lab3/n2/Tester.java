package ru.mirea.lab3.n2;

import java.util.Random;
import java.util.Scanner;

public class Tester {
    public static Circle[] sort1 (Circle [] arr, int n) {
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                if (arr[i].getRad() < arr[j].getRad()) {
                    Circle p = arr[i];
                    arr[i] = arr[j];
                    arr[j] = p;
                }
            }
        }
        return arr;
    }
    public static void main(String [] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Circle[] arr = new Circle[n];
        for (int i = 0; i < n; i ++) {
            Point p = new Point(rand.nextDouble(100), rand.nextDouble(100));
            Circle c1 = new Circle(p, rand.nextDouble(100));
            arr[i] = c1;
        }
        System.out.println("Изначальный массив: ");
        for (int i = 0; i < n; i ++) {
            System.out.println("Х: " + arr[i].getX() + " У: " + arr[i].getY() + " Radius: " + arr[i].getRad());
        }
        System.out.println();
        arr = sort1(arr, n);
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < n; i ++) {
            System.out.println("Х: " + arr[i].getX() + " У: " + arr[i].getY() + " Radius: " + arr[i].getRad());
        }
    }
}
