package com.company;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 34, 12, 3};
        Arrays.findAverage(array); // среднее арифметическое
        Sort.sortArray(array); //сортировка массива по убыванию + замена

        String string = "Java is the best language in the world";
        Strings.findLongestString(string);

        String str = "Live without regrets";
        Strings.findLongestString(str);

        String st = "Success";
        Strings.findLongestString(st);

    }
}