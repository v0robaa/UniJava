package ru.mirea.lab11.n1;
import java.util.Date;
import java.util.Calendar;

import java.util.Scanner;

public class ExerDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String developerName = in.next();


        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 14);
        calendar.set(Calendar.HOUR_OF_DAY, 16);
        calendar.set(Calendar.MINUTE, 43);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date getDate = calendar.getTime();

        Date sdachaDate = new Date();

        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + getDate);
        System.out.println("Дата и время сдачи задания: " + sdachaDate);
    }
}
