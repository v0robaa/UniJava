package ru.mirea.lab7.n5;

public class Execution implements StringInterface {
    //подсчет символов
    public int countChars(String str) {
        return str.length();
    }

    //возвращает строку из символов на нечетных позициях
    public String getOddChars(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    //инвертирование
    public String reverseString(String str) {
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }
}
