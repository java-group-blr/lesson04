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
        String[] text = string.split(" "); // разбиваем предложение пробелами, чтобы получить массив слов.
        String resstring = text[0];              // создаем моссив

        if (text.length == 1) // Если строка состоит из одного символа
            return string.toUpperCase() + " " + string.length();  // Преобразует все знаки в данной строке в верхний регистр
                                                                  //  и возврощяем с количеством символов в ней
        for (String word : text) {
            if (word.length() >= resstring.length())     // Находим самое длинное слово
                resstring = word;
        }
        return resstring + " " + resstring.length();  // Возврощяем самое длиное слова и количество символов в нем
    }
}