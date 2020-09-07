package com.company;

import java.io.OutputStream;

/**
 * Найти в строке самое длинное слово и количество символов в нем.
 * Если таких слов несколько - вернуть самое последнее из них (самое правое).
 * Если строка состоит из одного слова - вернуть исходную строку в верхнем регистре и количество символов в ней.
 * В качестве разделителя слов выступает пробел.
 * Знаки препинания не учитывать(представим, что их нет во входной строке)
 *
 * Например:
 *
 * Дано: "Java is the best language in the world"
 * Результат: "language 8"
 *
 * Дано: "Live without regrets"
 * Результат: "regrets 7"
 *
 * Дано: "Success"
 * Результат: "SUCCESS 7"
 */
public class Strings {

    public static String findLongestString(String string) {


        String[] strArr = string.trim().split(" ");

        if (strArr.length == 1)

            return string.toUpperCase() + " " + string.length();

        String result = strArr[0];

        for (String str : strArr
        ) {
            if (str.length() >= result.length()) {

                result = str;

            }


        }

        return result + " " + result.length();
        // Чтобы вернуть в верхнем регистре нужно  сделать  return result.toUpperCase() + " " + result.length();
        //но тогда тест не проходит, или я что то путю вывел верхний через майн

    }


}
