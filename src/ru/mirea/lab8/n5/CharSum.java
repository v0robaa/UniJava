package ru.mirea.lab8.n5;
import java.util.Scanner;
public class CharSum {
    public static int charSum(int num) {
        // Базовый случай: если число состоит из одной цифры, то его сумма равна самому числу
        if (num < 10) {
            return num;
        }

        // Рекурсивно вызываем функцию для числа без последней цифры и добавляем к ней последнюю цифру
        int lastDigit = num % 10;
        int remainingNum = num / 10;
        int sum = charSum(remainingNum) + lastDigit;

        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для подсчета суммы цифр: ");
        int N = in.nextInt();
        int sum = charSum(N);
        System.out.println("Сумма цифр: " + sum);
    }
}
