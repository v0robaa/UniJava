package ru.mirea.lab6.n11;

public class Testing {
    public static void main(String[] args)
    {
        CelsToFar test1 = new CelsToFar(23);
        CelsToKalv test2 = new CelsToKalv(23);
        System.out.println(test1.convert());
        System.out.println(test2.convert());
    }
}
