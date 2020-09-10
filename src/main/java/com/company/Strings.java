package com.company;

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
        String[] text = string.split(" "); // разбиваем предложение пробелами, чтобы получить массив слов
        String max_word = text[0]; // создаем массив
            for (String word : text) {
                if (word.length() >= max_word.length()) // Находим самое длинное слово
                max_word = word;
            }
        return max_word + " " + max_word.length(); // Возврощяем самое длиное слова и количество символов в нем
    }
}
