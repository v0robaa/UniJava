package ru.mirea.lab6.n11;

public class CelsToKalv implements Convertable{
    private double cels;
    public CelsToKalv(double cels)
    {
        this.cels = cels;
    }

    @Override
    public double convert()
    {
        return cels += 237;
    }
}
