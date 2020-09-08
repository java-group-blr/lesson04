package com.company;

/**
 * Найти среднее арифметическое всех элементов массива
 * <p>
 * Например:
 * <p>
 * Дано: [1,3,5,8]
 * Результат: 4
 */
public class Arrays {
    double[] array = {1, 3, 5, 8};
    static double sum = 0d;
    public static double findAverage(int[] array) {
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        sum /= array.length;
        return sum;
    }
}
