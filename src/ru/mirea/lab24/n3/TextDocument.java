package ru.mirea.lab24.n3;

public class TextDocument implements iDocument{
    @Override
    public void open() {
        System.out.println("TextDocument opened");
    }

    @Override
    public void save() {
        System.out.println("TextDocument saved");
    }

    @Override
    public void close() {
        System.out.println("TextDocument closed");
    }
}