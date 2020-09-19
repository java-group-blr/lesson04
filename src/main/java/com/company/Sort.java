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
        // Испольуем сортировку пузырьком
        for (int i = 0; i < array.length; i++) {           // Цикл  for каждый раз сокращает фрагмент массива,
            for (int j = 0; j < array.length - 1; j++) {   // Cтавя в конец фрагмента максимальный элемент.

                if (array[j + 1] > array[j]) {     //Сравниваем элементы попарно,
                    int temp = array[j];           // Если они имеют неправильный порядок,
                    array[j] = array[j + 1];       // Меняем их местами
                    array[j + 1] = temp;
                }
            }
        }
        // Меняем местами первый и последний элементы массива
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        System.out.println();
        return array;
    }
}