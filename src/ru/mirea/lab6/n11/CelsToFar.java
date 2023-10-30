package ru.mirea.lab6.n11;

public class CelsToFar implements Convertable{
    private double cels;

    public CelsToFar(double cels)
    {
        this.cels = cels;
    }
    @Override
    public double convert()
    {
        return cels * 5/9 + 32;
    }

}
