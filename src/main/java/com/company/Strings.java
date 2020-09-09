package com.company;

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

        String[] stringArray;
        String splitter = " ";
        stringArray = string.split(splitter);
        String s = stringArray[0];

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray.length == 1) {
                s = stringArray[i].toUpperCase();

                return s + " " + s.length();
            }
            if (s.length() <= stringArray[i].length()) {
                s = stringArray[i];
            }
        }
        return s + " " + s.length();
    }
}
