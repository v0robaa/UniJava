package ru.mirea.lab19.n1;
import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {

            System.out.print("Имя: ");
            String name = in.next();
            System.out.print("Фамилия: ");
            String surname = in.next();
            System.out.println("Введите ИНН: ");
            String innNumber = in.next();
            System.out.println("ФИО: " + name + " " + surname);


            validateINN(innNumber);

        } catch (WrongINN e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void validateINN(String innNumber) throws WrongINN {
        //Проверка номер ИНН > 8

        if (innNumber.length() < 8) {
            throw new WrongINN("Недействительный номер ИНН.");
        }
    }
}




