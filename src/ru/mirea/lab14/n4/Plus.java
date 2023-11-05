package ru.mirea.lab14.n4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Plus
{
    private String text;
    Plus(String text)
    {
        this.text = text;
    }
    public void Result()
    {
        String patternPlus = "\\d+(?![+])";
        Pattern pattern = Pattern.compile(patternPlus);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()) {
            System.out.println("Найдено число: " + matcher.group());
        }
    }
    public static void main(String[] args)
    {
        Plus plusChecker = new Plus("(1+8)–9/4");
        plusChecker.Result();
    }

}