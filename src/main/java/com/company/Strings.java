package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Найти в строке самое длинное слово и количество символов в нем.
 * Если таких слов несколько - вернуть самое последнее из них (самое правое).
 * Если строка состоит из одного слова - вернуть исходную строку в верхнем регистре и количество символов в ней.
 * В качестве разделителя слов выступает пробел.
 * Знаки препинания не учитывать(представим, что их нет во входной строке)
 * <p>
 * Например:
 * <p>
 * Дано: "Java is the best language in the world"
 * Результат: "language 8"
 * <p>
 * Дано: "Live without regrets"
 * Результат: "regrets 7"
 * <p>
 * Дано: "Success"
 * Результат: "SUCCESS 7"
 */
public class Strings {

    public static String findLongestString(String string) {
        String[] array = string.trim().split(" ");

        if (array.length == 1) {
            System.out.println(string.toUpperCase() + " " + string.length());
            return string.toUpperCase() + " " + string.length();
        }

        String maxWord = array[0];

        for (String s : array) {
            if (s.length() >= maxWord.length()) {
                maxWord = s;
            }
        }
        System.out.println(maxWord + " " + maxWord.length());
        return maxWord + " " + maxWord.length();
    }
}

   /* public static void main(String[] args) {
        String [] names = {"Deaaaaaaan", "Deaaan", "Deaaaaaaaan", "Dean", "Deaaaaaan", "Deaan", "Deaaaaaaaaan",  "Deaaaan", "Deaaaaan"};
        Comparator<String> stringLengthComparator = new StringLengthSort();
        for(String str : names){
            System.out.println(str);
        }
        Arrays.sort(names, stringLengthComparator); // применяем сортировку
        System.out.println("\nотсортировано\n");
        for(String str : names){
            System.out.println(str);
        } */