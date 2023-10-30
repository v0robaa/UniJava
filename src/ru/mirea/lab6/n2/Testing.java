package ru.mirea.lab6.n2;

public class Testing {
    public static void main(String[] args)
    {
        MovableRectangle rec1 = new MovableRectangle(1,4 , 5, 0, 3, 4);
        System.out.println(rec1.toString());
        rec1.moveRight();
        rec1.moveUp();
        System.out.println(rec1.toString());
    }
}
