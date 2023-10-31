package ru.mirea.lab13.n2;
public class Person {
    private String surname = "";
    private String name = "";
    private String patronymic = "";

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic;
    }

    public static void main(String[] args)
    {
        System.out.println("Ф.И.О: ");
        Person person1 = new Person("Петров");
        Person person2 = new Person("Петров", "Александр");
        Person person3 = new Person("Петров", "Александр", "Юрьевич");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

}
