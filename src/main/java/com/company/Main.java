package com.company;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Arrays arrays=new Arrays();
        double result=Arrays.findAverage(arr);
        System.out.println("Среднее арифметическое всех элементов массива: "+result);

        int[] arr2 = {1,23,42,6,8,3};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        Sort sort=new Sort();
        int arr_result[]=Sort.sortArray(arr2);

        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < arr_result.length; i++) {
            System.out.println(arr_result[i]);
        }
    }
}
