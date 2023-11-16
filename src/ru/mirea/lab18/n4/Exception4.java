package ru.mirea.lab18.n4;
import java.util.Scanner;
public class Exception4 {
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
            System.err.println("Catch ");
        }
        finally
        {
            System.out.println("Finally ");
        }
        System.out.println("После try-catch");
    }
    public static void main(String[] args)
    {
        Exception4 check = new Exception4();
        check.exceptionDemo();
    }
}
