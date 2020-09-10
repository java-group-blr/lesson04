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
        double average_number = 0;
        int sum_of_numbers = 0;
        for (int i = 0; i < array.length; i++) {
            sum_of_numbers += array[i];
        }
        average_number = sum_of_numbers / array.length;
        return average_number;
    }
}
