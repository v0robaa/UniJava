package ru.mirea.lab3.n5;

import java.util.Scanner;

public class NechetArr {
    public static int randomise(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите верхнюю границу диапазона:");
        int n = in.nextInt();
        int diapason_min = 0;

        while (n <= 0) {
            System.out.println("try again");
            n = in.nextInt();
        }

        int[] arr = new int[n];
        int uneven_counter = 0;
        System.out.println("Изначальный массив:");
        for (int i = 0; i < n; i ++) {
            arr[i] = randomise(diapason_min, n);
            if (arr[i] % 2 == 1) {
                uneven_counter++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Нечетные элементы массива:");
        int j = 0;
        int[] arr2 = new int[uneven_counter];
        for (int i = 0; i < n; i ++) {
            if (arr[i] % 2 == 1) {
                arr2[j] = arr[i];
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
    }
}

