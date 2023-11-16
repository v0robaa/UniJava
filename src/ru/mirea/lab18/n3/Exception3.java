package ru.mirea.lab18.n3;
import java.util.Scanner;
public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Введите целое число ");
            String intString = myScanner.next();
            //int i = Integer.parseInt(intString);
            int i = Integer.valueOf(intString);
            System.out.println(2/i);
        }
        catch(Exception eb)
        {
            System.err.println("Исключение е");
        }
//        catch(NumberFormatException e)
//        {
//            System.err.println("Catch ");
//        }
        finally
        {
            System.out.println("Finally ");
        }
        System.out.println("После try-catch");
    }
    public static void main(String[] args)
    {
        Exception3 check = new Exception3();
        check.exceptionDemo();
    }
}
