package ru.mirea.lab1;

import java.util.Scanner;

public class n1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num; // кол-во чисел
        int sum = 0;
        int case_n;
        System.out.println("Введите кол-во чисел: ");
        num = in.nextInt();
        int[] array = new int[num];

        System.out.println("1 - Ручной ввод, 2 - Рандом: ");
        while(true){
            case_n = in.nextInt();
            if (case_n == 1 || case_n == 2){
                break;
            }
            System.out.println("Ошибка ввода");
        }

        switch (case_n) {
            case 1 -> {
                System.out.println("Введите " + num + " чисел:");
                for (int i = 0; i < num; i++) // цикл for
                {
                    array[i] = in.nextInt();
                    sum += array[i]; // счет суммы
                }
            }
            case 2 -> {
                for (int i = 0; i < num; i++) // цикл for
                {
                    array[i] = (int) (Math.random() * 100); // случайное заполнение массива
                    sum += array[i]; // счет суммы
                }
            }
        }

        System.out.println("Ваш массив: ");
        for (int i = 0; i < num; i++) // цикл вывода массива
        {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n" + "Среднее арифметическое: " + sum / num);
    }
}
