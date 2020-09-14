package com.company;

public class Sort {

    public static int[] sortArray(int[] mas) {
        boolean isSorted = false;
        int buf;

        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++){
                if(mas[i] < mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas [i+1];
                    mas[i+1] = buf;
                }
            }
        }
        int firstElements = mas[0];
        int lastElements = mas[mas.length-1];

        mas[0] = lastElements;
        mas[mas.length-1] = firstElements;

        return mas;
    }

}
