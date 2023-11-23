package ru.mirea.lab9.n2;
import java.util.Arrays;
public class SortingStudentsByGPA implements Comparator {
    public void sorter(int[] arr) {
        int low = 0;
        int high = arr.length-1;

    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high); // Индекс разделителя

            quickSort(arr, low, partitionIndex - 1);  // Сортировка левой части массива
            quickSort(arr, partitionIndex + 1, high); // Сортировка правой части массива
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Выбираем последний элемент в качестве опорного
        int i = (low - 1); // Индекс меньшего элемента

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Помещаем текущий элемент перед разделителем
                swap(arr, i, j);
            }
        }

        // Помещаем разделитель после всех меньших элементов
        swap(arr, i + 1, high);

        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {56, 24, 91, 64, 33, 68};
        System.out.println("До сортировки: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("После сортировки: " + Arrays.toString(arr));
    }

}
