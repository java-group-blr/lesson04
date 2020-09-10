package com.company;

public class Strings {

    public static String findLongestString(String string) {
        String[] massWord = string.split(" ");
        if (massWord.length == 1) {
            return massWord[0].toUpperCase() + " " + massWord[0].length();
        }

        int maxLength = 0;
        String maxWord = "";
        for (String word : massWord) {
            if (!(maxLength > word.length())) {
                maxLength = word.length();
                maxWord = word + " " + maxLength;
            }
        }
        return maxWord;
    }

}
