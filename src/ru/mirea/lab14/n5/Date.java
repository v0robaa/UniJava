package ru.mirea.lab14.n5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
    public static void main(String[] args)
    {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";
        String date1 = "01/02/2000";
        String date2 = "30-04-2001";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date1);
        Matcher matcher2 = pattern.matcher(date2);
        System.out.println(matcher.matches()); //true или false
        System.out.println(matcher2.matches());
    }
}