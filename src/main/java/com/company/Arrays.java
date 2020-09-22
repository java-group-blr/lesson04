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
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
}
