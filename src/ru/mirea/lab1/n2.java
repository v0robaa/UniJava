package ru.mirea.lab1;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Введите кол-во чисел: ");
        num = in.nextInt();
        int[] arr = new int[num];

        System.out.println("Заполните массив: ");
        for(int i = 0; i < num; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Ваш массив: ");
        for(int j = 0; j < num; j++)
        {
            System.out.println(arr[j] + " ");
        }


        System.out.println("Решение через цикл while: ");
        int counter1 = 0;
        int sum1 = 0;
        int max1 = 0;
        int min1 = Integer.MAX_VALUE;
        while(counter1 < num)
        {
            sum1 += arr[counter1];
            if(arr[counter1] > max1)
                max1 = arr[counter1];
            if(arr[counter1] < min1)
                min1 = arr[counter1];
            counter1++;
        }
        System.out.println("Сумма чисел: " + sum1);
        System.out.println("Максимальное число: " + max1);
        System.out.println("Минимальное число: " + min1 + "\n");

        System.out.println("Решение через цикл do while: ");
        int counter2 = 0;
        int sum2 = 0;
        int max2 = 0;
        int min2 = Integer.MAX_VALUE;
        do
        {
            sum2 += arr[counter2];
            if(arr[counter2] > max2)
                max2 = arr[counter2];
            if(arr[counter2] < min2)
                min2 = arr[counter2];
            counter2++;
        }
        while(counter2 < num);
        System.out.println("Сумма чисел: " + sum2);
        System.out.println("Максимальное число: " + max2);
        System.out.println("Минимальное число: " + min2 + "\n");

        System.out.println("Проверка результатов...");
        if(sum1 == sum2 && max1 == max2 && min1 == min2)
            System.out.println("Проверка успешно пройдена!");
        else
            System.out.println("Результаты не равны!");
    }
}
