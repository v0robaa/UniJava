package ru.mirea.lab14.n6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email
{
    public static void main(String[] args)
    {
        String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        // \\. означает экранирование точки. Без \\ точка означала бы "любой символ".
        // ?: означает начало необязательной группы символов
        String eMail1 = "user@example";
        String eMail2 = "myhost@@@com.ru";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(eMail1);
        Matcher matcher2 = pattern.matcher(eMail2);
        System.out.println(matcher1.matches()); //true или false
        System.out.println(matcher2.matches());
    }
}
