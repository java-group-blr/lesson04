package com.company;

/**
 * Найти среднее арифметическое всех элементов массива
 *
 * Например:
 *
 * Дано: [1,3,5,8]
 * Результат: 4
 */
public class Arrays {
    public static double findAverage(int[] array) {
        int sum = 0;
        double average;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = (double) sum/array.length;
        return average;
    }
}
