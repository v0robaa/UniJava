package ru.mirea.lab13.n5;
import java.util.Scanner;
public class Number {
    public String formatPhoneNumber(String phoneNumber) {
        String formattedNumber = phoneNumber.trim().replaceAll("[^0-9]", "");

        if (formattedNumber.startsWith("8")) {
            formattedNumber = "+7" + formattedNumber.substring(1);
        } else if (!formattedNumber.startsWith("+")) {
            formattedNumber = "+" + formattedNumber;
        }

        String countryCode = formattedNumber.substring(1, formattedNumber.length() - 10);
        String firstThreeDigits = formattedNumber.substring(formattedNumber.length() - 10, formattedNumber.length() - 7);
        String secondThreeDigits = formattedNumber.substring(formattedNumber.length() - 7, formattedNumber.length() - 4);
        String lastFourDigits = formattedNumber.substring(formattedNumber.length() - 4);

        formattedNumber = String.format("+%s (%s)-%s-%s", countryCode, firstThreeDigits, secondThreeDigits, lastFourDigits);

        return formattedNumber;
    }

    public static void main(String[] args) {
        Number formatter = new Number();
        String phoneNumber1 = "+79175655655";
        System.out.println(formatter.formatPhoneNumber(phoneNumber1));

        String phoneNumber2 = "+104289652211";
        System.out.println(formatter.formatPhoneNumber(phoneNumber2));

        String phoneNumber3 = "89175655655";
        System.out.println(formatter.formatPhoneNumber(phoneNumber3));
    }
}
