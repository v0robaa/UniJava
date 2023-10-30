package ru.mirea.lab9.n1;
import java.util.Arrays;
public class Sorting {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
    }

    public static void print(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Имя: " + student.getName());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student(123405, "Паша"),
                new Student(457546, "Маша"),
                new Student(787698, "Даша"),
                new Student(236784, "Ибрагим")
        };

        System.out.println("Изначальный массив: ");
        print(students);

        insertionSort(students);

        System.out.println("Отсортированный массив:");
        print(students);
    }
}
