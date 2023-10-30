package ru.mirea.lab2.n9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {

        List<String> cards = new ArrayList<>();
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♤", "♡", "♧", "♢"};

        for(String number : numbers)
            for(String suit : suits)
                cards.add(number + suit);
        cards.remove(10);

        int playersCount = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        playersCount = in.nextInt();
        if(playersCount > 10)
            System.out.println("Слишком много игроков!");
        else if(playersCount < 1)
            System.out.println("Слишком мало игроков!");
        else{
            String[] playerHand = new String[playersCount];
            for(int i = 0; i < playersCount; i++){
                playerHand[i] = "";
                for(int j = 0; j < 5; j++){
                    int randInd = new Random().nextInt(cards.size());
                    String pick = cards.get(randInd);
                    playerHand[i] += pick + " ";
                    cards.remove(randInd);
                }
            }

            for(int i = 0; i < playerHand.length; i++){
                System.out.println("Игрок " + (i + 1) + ": " + playerHand[i]);
            }
        }
    }
}
