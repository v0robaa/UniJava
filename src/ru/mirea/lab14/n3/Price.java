package ru.mirea.lab14.n3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Price {
    public static void main(String[] args) {
        String text = "Список цен: 25.98 USD, 150.25 RUB, 10.50 EUR, 44 ERR, 0.004 EU";

        // Регулярное выражение для извлечения цены в USD
        String usdPattern = "\\d+(\\.\\d{2})? USD";
        Pattern pattern = Pattern.compile(usdPattern);
        Matcher matcher = pattern.matcher(text);

        // Извлечение цены в USD
        if (matcher.find()) {
            String usdPrice = matcher.group();
            System.out.println("Цена в USD: " + usdPrice);
        }

        // Регулярное выражение для извлечения цены в RUB
        String rubPattern = "\\d+(\\.\\d{2})? RUB";
        pattern = Pattern.compile(rubPattern);
        matcher = pattern.matcher(text);

        // Извлечение цены в RUB
        if (matcher.find()) {
            String rubPrice = matcher.group();
            System.out.println("Цена в RUB: " + rubPrice);
        }

        // Регулярное выражение для извлечения цены в EUR
        String eurPattern = "\\d+(\\.\\d{2})? EUR";
        pattern = Pattern.compile(eurPattern);
        matcher = pattern.matcher(text);

        // Извлечение цены в EUR
        if (matcher.find()) {
            String eurPrice = matcher.group();
            System.out.println("Цена в EUR: " + eurPrice);
        }
    }
}
