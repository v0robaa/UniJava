package ru.mirea.lab19.n1;

public class WrongINN extends RuntimeException {
    public WrongINN(String ErrorMessage, Throwable err)
    {
        super(ErrorMessage, err);
    }
}