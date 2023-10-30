package ru.mirea.lab4_1.n5;

public class Test {
    public static void main(String[] args) {
        // Создание массива объектов класса Reader
        Reader[] readers = new Reader[2];
        readers[0] = new Reader("Почкин В.В", 14234234, "Философия", "23.11.1998", "+7(900)564-65-65");
        readers[1] = new Reader("Печенкина А.А", 12345376, "Геология", "03.08.1999", "+7(985)898-23-43");

        // Вызов перегруженных методов takeBook() и returnBook()
        readers[0].takeBook(3);
        readers[0].takeBook("МатАн 1 сем", "Английский 2 сем", "Энциклопедия философа");
        readers[0].takeBook(new Book("ЛинАл 2 сем", "Галина Б.Л"), new Book("Дюжина", "Двенадцатькин А.А"));

        readers[1].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[1].returnBook(2);
        readers[1].returnBook(new Book("Приключения", "Автор 1"), new Book("Словарь", "Автор 2"));
    }
}
