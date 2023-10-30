package ru.mirea.lab2.n4;

public class PC {
    private String name;
    public String getName() {
        return name;
    }
    PC(String name) {
        this.name = name;
    }
    PC() {
        name = "Компьютер не";
    }

}
