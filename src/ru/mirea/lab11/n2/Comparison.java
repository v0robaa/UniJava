package ru.mirea.lab11.n2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        //получение текущей даты
        LocalDateTime currentDateTime = LocalDateTime.now();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату и время в формате 'yyyy-MM-dd HH:mm':");
        String inputDateTimeString = in.nextLine();

        //преобразование в LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime inputDateTime = LocalDateTime.parse(inputDateTimeString, formatter);

        if (currentDateTime.isBefore(inputDateTime)) {
            System.out.println("Введенное время позже текущего времени."); //-1
        } else if (currentDateTime.isAfter(inputDateTime)) {
            System.out.println("Введенное время раньше текущего времени."); //0
        } else {
            System.out.println("Введенное время совпадает с текущим временем."); //1
        }
    }
}

