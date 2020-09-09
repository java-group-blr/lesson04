package com.company;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
    double result = Arrays.findAverage(array);
        System.out.println(result);
        int[] result1 = Sort.sortArray(array);

//Поиск наибольшего слова
    String str1 = "я хочу спать";

    String string = Strings.findLongestString(str1);

        System.out.println(string.toUpperCase());
    }
}




