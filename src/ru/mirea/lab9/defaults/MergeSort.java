package ru.mirea.lab9.defaults;

import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3, 6};

        System.out.println("Before sorting: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid); // Левая часть массива
            int[] right = Arrays.copyOfRange(arr, mid, arr.length); // Правая часть массива

            mergeSort(left); // Рекурсивная сортировка левой части
            mergeSort(right); // Рекурсивная сортировка правой части

            merge(arr, left, right); // Слияние отсортированных частей
        }
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0; // Индекс для левой части
        int j = 0; // Индекс для правой части
        int k = 0; // Индекс для исходного массива

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}