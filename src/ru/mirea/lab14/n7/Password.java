package ru.mirea.lab14.n7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password
{
    public static void main(String[] args)
    {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z0-9_]{8,}$";
        String password1 = "MyPas2word";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password1);
        System.out.println(matcher.matches()); //true или false
        /*
        ^ и $ - начало и конец строки
        ?=.* - конструкция "positive lookahead". Используется для проверки условия
        в строке. ?= - начало позитивного просмотра вперед, .* - любые символы любое
        количество раз. [a-z] - одна маленькая буква от a до z.
        [A-Z] - одна большая буква
        \\d - одна цифра
        [a-zA-Z0-9_] - компоненты строки
        {8,} - 8 и более символов
         */

    }
}