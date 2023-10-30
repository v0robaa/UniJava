package ru.mirea.lab3.n1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int n = in.nextInt();
        int[] mass = new int[n];
        int case_n = 0;
        System.out.println("1 - Math" + "\n" + "2 - Random:");
        case_n = in.nextInt();
        switch (case_n)
        {
            case 1:
                System.out.println("Изначальный массив:");
                for (int i = 0; i < n; i++) {
                    mass[i] = (int)(Math.random()*1000);
                    System.out.print(mass[i] + " ");
                }
                break;
            case 2:
                Random rand = new Random();
                System.out.println("Изначальный массив:");
                for (int i = 0; i < n; i++) {
                    mass[i] = rand.nextInt(1000);
                    System.out.print(mass[i] + " ");
                }
                break;

            default:
                System.out.println("Неверный ввод");
                break;
        }
        Arrays.sort(mass);
        System.out.println("\n" + "Отсортированный массив: ");
        for (int i = 0; i < n; i ++) {
            System.out.print(mass[i] + " ");
        }
    }
}
