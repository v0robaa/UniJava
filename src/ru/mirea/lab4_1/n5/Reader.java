package ru.mirea.lab4_1.n5;
import java.util.Arrays;
public class Reader {
    private String fullName;
    private int tick_num;
    private String faculty;
    private String date_of_birth;
    private String phone;

    public Reader(String fullName, int tick_num, String faculty, String date_of_birth, String phone)
    {
        this.fullName = fullName;
        this.tick_num = tick_num;
        this.faculty = faculty;
        this.date_of_birth = date_of_birth;
        this.phone = phone;
    }

    public String getName() {
        return fullName;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookNames) {
        System.out.println(fullName + " взял книги: " + Arrays.toString(bookNames));
    }

    public void takeBook(Book... books) {
        StringBuilder message = new StringBuilder(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            message.append(books[i].getTitle());
            if (i != books.length - 1) {
                message.append(", ");
            }
        }
        System.out.println(message);
    }

    public void returnBook(String... bookNames) {
        System.out.println(fullName + " вернул книги: " + Arrays.toString(bookNames));
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(Book... books) { //какое угодно кол-во объектов типа books, заменяет массив
        StringBuilder message = new StringBuilder(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            message.append(books[i].getTitle());
            if (i != books.length - 1) {
                message.append(", ");
            }
        }
        System.out.println(message);
    }
}
