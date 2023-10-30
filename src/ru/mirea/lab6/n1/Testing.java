package ru.mirea.lab6.n1;

public class Testing {
    public static void main(String[] args)
    {
        MovableCircle cir1 = new MovableCircle(0, 0, 5,6, 4);
        System.out.println(cir1.toString());
        cir1.moveDown();
        System.out.println(cir1.toString());
    }
}
