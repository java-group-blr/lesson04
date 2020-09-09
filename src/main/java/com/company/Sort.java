package com.company;

/**
 * Дан целочисленный массив. Отсортировать его по убыванию и поменять местами первый и последний элемент.
 *
 * Например:
 *
 * Дано: [1,23,42,6,8,3]
 * Результат: [1,23,8,6,3,42]
 */
public class Sort {

    public static int[] sortArray(int[] array) {
        return new int[0];
        int[] arr = {1,23,42,6,8,3};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
