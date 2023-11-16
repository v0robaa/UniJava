package ru.mirea.lab18.n1;

public class Test
    {
        public void exceptionDemo() {
        try {
            System.out.println();
        } catch (ArithmeticException e)
        {
            System.out.println("Attempted division by zero");
        }
    }
        public static void main (String[] args)
        {
            Test check = new Test();
            check.exceptionDemo();
        }
    }

