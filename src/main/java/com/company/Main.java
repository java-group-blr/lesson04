package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАНИЕ 1");
        int[] arr = {1, 3, 5, 8};
        for (int i: arr){
        //for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }
        Arrays arrays = new Arrays();
        double result = Arrays.findAverage(arr);
        System.out.println("Среднее арифметическое всех элементов массива: " + result);

        System.out.println("ЗАДАНИЕ 2");
        int[] arr2 = {1, 23, 42, 6, 8, 3};
        for (int i: arr2){
        //for (int i = 0; i < arr2.length; i++) {
            System.out.println(i);
        }
        Sort sort = new Sort();
        int arr_result[] = Sort.sortArray(arr2);
        System.out.println("Отсортированный массив: ");
        for (int i: arr_result){
        //for (int i = 0; i < arr_result.length; i++) {
            System.out.println(i);
        }

        System.out.println("ЗАДАНИЕ 3");
        String arr3 = "Live without regrets";
        System.out.println(arr3);
        Strings strings = new Strings();
        String arr_word = Strings.findLongestString(arr3);
        System.out.println("Cамое длинное слово и количество символов в нем: ");
        System.out.println(arr_word);
    }
}
