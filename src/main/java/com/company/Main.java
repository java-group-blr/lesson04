package com.company;

public class Main {

    public static void main(String[] args) {
//Arrays
System.out.println(Arrays.findAverage());

//Sort
 int[] mas = {1,23,42,6,8,3};
 Sort.sortArray(mas);
 for (int item : mas) {
 System.out.println(item);
 }

//Strings
        System.out.println(Strings.findLongestString("Java is the best language in the World"));
        System.out.println(Strings.findLongestString("java"));
    }
}