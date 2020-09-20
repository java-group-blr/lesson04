package com.company;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
    int[] array = {1,3,5,8};
        System.out.println(Arrays.findAverage(array));
        int[] array2 = {1,23,42,6,8,3};
        Sort.sortArray(array2);
        for (int x:array2) {
            System.out.print(x + " ");
        }
        System.out.println();
        String str1 = "Java is the best language in the world";
        String str2 = "Live without regrets";
        String str3 = "Success";
        System.out.println(Strings.findLongestString(str1));
        System.out.println(Strings.findLongestString(str2));
        System.out.println(Strings.findLongestString(str3));
    }
}