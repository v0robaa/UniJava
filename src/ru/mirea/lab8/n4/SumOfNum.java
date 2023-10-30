package ru.mirea.lab8.n4;
import java.util.Scanner;
public class SumOfNum {
    public static int countNumbersWithSum(int k, int s) {
        // Базовый случай: если k равно 0 и d равно 0, значит мы нашли число с требуемыми свойствами
        if (k == 0 && s == 0) {
            return 1;
        }
        // Базовый случай: если k равно 0 или s меньше 0, значит такое число невозможно
        if (k == 0 || s < 0) {
            return 0;
        }

        int count = 0;
        // Рекурсивно вызываем функцию для каждой возможной цифры, которая может находиться на текущей позиции
        for (int i = 1; i <= 9; i++) {
            count += countNumbersWithSum(k - 1, s - i);
        }

        return count;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во цифр в числе: ");
        int k = in.nextInt();
        System.out.println("Введите сумму цифр: ");
        int s = in.nextInt();

        int count = countNumbersWithSum(k, s);
        System.out.println("Количество чисел: " + count);
    }
}
