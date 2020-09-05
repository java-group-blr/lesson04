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
        for (int number: array
             ) {
            sum += number;
        }
    return (double) sum/array.length;
    }
}
