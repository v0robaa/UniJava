package ru.mirea.lab4.n2;

import java.util.Random;

public class Test {
    public static void main(String[] arg) {
        Clothes[] mass = new Clothes[10];
        Random rand = new Random();
        mass[0] = new Pants("black", Atelier.sizes.XXS, rand.nextInt(1000));
        mass[1] = new Skirt("light blue", Atelier.sizes.XS, rand.nextInt(1000));
        mass[2] = new Tie("green", Atelier.sizes.S, rand.nextInt(1000));
        mass[3] = new TShirt("grey", Atelier.sizes.M, rand.nextInt(1000));
        mass[4] = new Pants("white", Atelier.sizes.L, rand.nextInt(1000));
        for (int i = 0; i < 5; i ++) {
            if (mass[i] instanceof MenClothing) {
                ((MenClothing) mass[i]).dressMan();
            }
            if (mass[i] instanceof WomanClothing) {
                ((WomanClothing) mass[i]).dressWoman();
            }
        }
    }
}
