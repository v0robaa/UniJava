package ru.mirea.lab3.n3;

import java.util.Scanner;

public class ArrList {
    public static int randomise(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int diapason_max = 99;
        int diapason_min = 10;
        int n;
        System.out.println("Введите кол-во массивов:");
        n = in.nextInt();
        for (int j = 0; j < n; j++) {
            int[] arr = new int[4];
            boolean flag = true;
            for (int i = 0; i < 4; i++) {
                arr[i] = randomise(diapason_min, diapason_max);
                System.out.print(arr[i] + " ");
                if (i > 0  && (arr[i-1] > arr[i])) {
                    flag = false;
                }
            }
            System.out.println();
            if (flag) {
                System.out.println("^ Строго возрастает! ^");
            } else {
                System.out.println("^ :( ^");
            }

        }
    }
}
