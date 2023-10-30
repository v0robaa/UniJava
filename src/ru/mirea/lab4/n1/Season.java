package ru.mirea.lab4.n1;

import java.util.Scanner;

public class Season {
    public enum season {
        Winter(-10, 90),
        Summer(22, 92) {
            @Override
            public void toDiscription() {
                System.out.println("Hot season");
            }
        },
        Spring(7, 92), Autumn(5, 91);

        private final int temp;
        private final int days;

        private season(int temp, int days) {
            this.temp = temp;
            this.days = days;
        }

        public int getTemp() {
            return this.temp;
        }

        public int getDays() {
            return days;
        }

        public void toDiscription() {
            System.out.println("Cold season");
        }

    }
    public static void DoILike(season name) {
        String s_name = name.toString();
        if (s_name.equals("Spring")) {
            System.out.println("I love Spring");
        } else {
            System.out.println("I hate " + s_name);
        }
    }
    public static void main(String [] args) {
        System.out.println("Input season");
        Scanner in = new Scanner(System.in);
        String com = in.nextLine();
        switch (com) {
            case "Summer":
                DoILike(season.Summer);
                break;
            case "Spring":
                DoILike(season.Spring);
                break;
            case "Autumn":
                DoILike(season.Autumn);
                break;
            case "Winter":
                DoILike(season.Winter);
                break;
        }
        season[] arr = {season.Autumn, season.Winter, season.Spring, season.Summer };
        for (int i = 0; i < arr.length; i ++) {
            DoILike(arr[i]);
            System.out.println(arr[i].getDays() + " days");
            System.out.println(arr[i].getTemp() + " mid temperature");
            arr[i].toDiscription();
            System.out.println();
        }
    }
}

