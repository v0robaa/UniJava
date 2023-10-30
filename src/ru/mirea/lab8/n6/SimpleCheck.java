package ru.mirea.lab8.n6;
import java.util.Scanner;
public class SimpleCheck {
    public static boolean isPrime(int n, int divisor) {
        // Базовый случай: если делитель равен самому числу, значит число простое
        if (divisor == n) {
            return true;
        }

        // Если число делится без остатка на текущий делитель, оно составное
        if (n % divisor == 0) {
            return false;
        }

        // Рекурсивно вызываем функцию, увеличивая делитель на 1
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();

        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    //сложность алгоритма составляет O(log n), так как для проверки простоты числа мы увеличиваем делитель на 1 с каждым рекурсивным вызовом.
}
