package ru.mirea.lab2.n8;

public class Change
{
    public static void main(String[] args) {
        String[] symbol = new String[100];
        for (int i = 0; i < symbol.length; i++){
            symbol[i] = i + "~";
            System.out.print(symbol[i]);
        }
        for (int i = 0; i < symbol.length/2; i++){
            String temp = symbol[i];
            symbol[i] = symbol [symbol.length-1-i];
            symbol[symbol.length-1-i] = temp;
        }
        System.out.println();
        for (String s : symbol) {
            System.out.print(s);
        }
    }
}
