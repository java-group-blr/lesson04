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
    public static double findAverage(int[] array) {

        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {  // Для начала найдем сумму всех элементов массива
                sum += array[j];
            }
            average = sum / array.length;    //  Находим среднее арифметическое
        }                                    // Сумма всех элементов массива деленная на их количество
        return average;
    }
}
