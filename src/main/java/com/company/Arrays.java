package com.company;

public class Arrays {
    public static double findAverage() {
        int[] myArray = {1, 3, 5, 8};
        double arithm = 0;
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        arithm = sum / (myArray.length);
        //System.out.println(arithm);
        return arithm;
    }

}
