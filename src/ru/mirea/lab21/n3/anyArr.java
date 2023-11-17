package ru.mirea.lab21.n3;
import java.lang.reflect.Array;

public class anyArr {
    public static <T> T getElement(Object array, int index) {
        if (array == null || !array.getClass().isArray() || index < 0 || index >= Array.getLength(array)) {
            return null;
        }

        return (T) Array.get(array, index);
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 23, 30};
        String[] stringArray = {"Любой", "Элемент"};

        Integer element1 = getElement(intArray, 1);
        System.out.println("Элемент 1 массива intArray: " + element1);

        String element2 = getElement(stringArray, 0);
        System.out.println("Элемент 0 массива stringArray: " + element2);
    }
}