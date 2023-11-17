package ru.mirea.lab21.n2;
import java.util.Arrays;
public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        // Создаем массив типа Object, так как стирание типов не позволяет создать массив типа T
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>(5);
        intArray.set(0, 10);
        intArray.set(1, 20);
        intArray.set(2, 30);
        System.out.println(intArray);
        System.out.println(intArray.get(1));

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.set(0, "Списки");
        stringArray.set(1, "дз");
        System.out.println(stringArray);
        System.out.println(stringArray.get(0));
    }
}