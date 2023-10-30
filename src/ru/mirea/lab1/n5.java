package ru.mirea.lab1;

import java.util.Scanner;

public class n5
{
    public static void fact(int num)
    {
        int res = 1;
        for (int i = 1; i <= num; i++)
        {
            res *= i;
        }
        System.out.println(res);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
       System.out.print("Факториал числа: ");
        fact(n);
    }
}
