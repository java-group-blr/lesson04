package com.company;

import java.util.stream.IntStream;

/**
 * Найти среднее арифметическое всех элементов массива
 * <p>
 * Например:
 * <p>
 * Дано: [1,3,5,8]
 * Результат: 4
 */
public class Arrays {
    public static double findAverage(int[] array) {
        // самое простое решение
        /*double actual = IntStream.of(array).average().getAsDouble();
        System.out.println(actual);
        return actual;*/
        double average = 0;
        if (array.length > 0) {
            double summ = 0;
            for (int i = 0; i < array.length; i++) {
                summ += array[i];
            }
            average = summ / array.length;
        }
        System.out.println(average);
        return average;
    }
}
