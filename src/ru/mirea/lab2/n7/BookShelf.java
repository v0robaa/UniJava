package ru.mirea.lab2.n7;
import java.util.Scanner;

public class BookShelf {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Scanner iin = new Scanner(System.in);

        System.out.println("Введите кол-во книг:");
        int n = iin.nextInt();
        Book [] books = new Book[n];

        for (int i = 0; i < n; i ++)
        {
            books[i] = new Book();
            System.out.println("Введите название книги " + (i + 1) + ":");
            books[i].setName(in.nextLine());
            System.out.println("Введите автора книги " + (i + 1) + ":");
            books[i].setAuthor(in.nextLine());
            System.out.println("Введите год написания книги " + (i + 1) + ":");
            books[i].setYear(iin.nextInt());
        }
        System.out.println("Книги:");
        for (int i = 0; i < n; i ++) {
            System.out.println((i+1) + ": " + (books[i].getName()) + " " + books[i].getAuthor() + " " + books[i].getYear());
        }
        System.out.println();

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j ++) {
                if (books[i].getYear() < books[j].getYear()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
        System.out.println("Отсортированные книги: ");
        for (int i = 0; i < n; i ++) {
            System.out.println((i+1) + ": " + (books[i].getName()) + " " + books[i].getAuthor() + " " + books[i].getYear());
        }
    }
}
