package ru.mirea.lab21.n1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class arrToList {
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"Стираю", "типы"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println(stringList);

        Integer[] intArray = {1, 2, 2, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println(intList);
    }
}
