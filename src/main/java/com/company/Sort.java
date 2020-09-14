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

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = (int) x;
                    System.out.println(array[i]);
                }
            }
        }
        int replace = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = replace;
        System.out.println(replace);

        return array;

    }
}
