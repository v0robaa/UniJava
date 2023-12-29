package ru.mirea.lab9.n3;
import java.util.ArrayList;
import java.util.List;
public class Sorting {
    public static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getIDNumber() < student2.getIDNumber()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(123456, "Паша"));
        list1.add(new Student(453426, "Маша"));
        list1.add(new Student(345789, "Саша"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(234534, "Антон"));
        list2.add(new Student(563457, "Катя"));
        list2.add(new Student(890235, "Василий"));

        List<Student> mergedList = mergeSortedLists(list1, list2);

        System.out.println("Отсортированный список:");
        for (Student student : mergedList) {
            System.out.println("ID: " + student.getIDNumber() + ", Имя: " + student.getName());
        }
    }
}
