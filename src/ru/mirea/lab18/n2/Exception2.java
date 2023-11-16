package ru.mirea.lab18.n2;
import java.util.Scanner;
public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Введите целое число ");
            String intString = myScanner.next();
            //int i = Integer.parseInt(intString);
            int i = Integer.valueOf(intString);
            System.out.println(2/i);
        }
        catch(NumberFormatException e)
        {
            System.err.println("Неверный ввод! ");
        }
    }
    public static void main(String[] args)
    {
        Exception2 check = new Exception2();
        check.exceptionDemo();
    }
}
