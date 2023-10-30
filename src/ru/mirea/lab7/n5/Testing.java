package ru.mirea.lab7.n5;
import java.util.Scanner;
public class Testing {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Execution manipulator = new Execution();

        System.out.print("Введите строку: ");
        String input = in.nextLine();

        // Вызываем функции интерфейса
        int characterCount = manipulator.countChars(input);
        String oddCharacters = manipulator.getOddChars(input);
        String reversedString = manipulator.reverseString(input);

        System.out.println("Количество символов в строке: " + characterCount);
        System.out.println("Строка с символами на нечетных позициях: " + oddCharacters);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}
