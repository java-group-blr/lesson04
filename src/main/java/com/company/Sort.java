package com.company;

/**
 * Дан целочисленный массив. Отсортировать его по убыванию и поменять местами первый и последний элемент.
 * <p>
 * Например:
 * <p>
 * Дано: [1,23,42,6,8,3]
 * Результат: [1,23,8,6,3,42]
 */
public class Sort {

    public static int[] sortArray(int[] array) {
        //сортировка по убыванию
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        //меняем местами первый и полследний элемент
        int n1 = array[0]; //
        array[0] = array[4];
        array[4] = n1;
        //вывод массива в консоль
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "  ");
        }
        return new int[5];
    }
}