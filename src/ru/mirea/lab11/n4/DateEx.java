package ru.mirea.lab11.n4;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите часы:");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты:");
        int minutes = scanner.nextInt();

        //объект Date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);
        Date date = calendar.getTime();
        System.out.println("Объект Date: " + date);

        //объект Calendar
        Calendar customCalendar = Calendar.getInstance();
        customCalendar.set(Calendar.YEAR, year);
        customCalendar.set(Calendar.MONTH, month - 1);
        customCalendar.set(Calendar.DAY_OF_MONTH, day);
        customCalendar.set(Calendar.HOUR_OF_DAY, hours);
        customCalendar.set(Calendar.MINUTE, minutes);
        System.out.println("Объект Calendar: " + customCalendar.getTime());

    }
}