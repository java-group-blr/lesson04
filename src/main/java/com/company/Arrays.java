//Найти среднее арифметическое всех элементов массива
//Например:
//Дано: [1,3,5,8]
//Результат: 4

public class Arrays {
    public static void average_of_numbers(int[] array) {
        int[] arr = {1,3,5,8};
        int sum_of_numbers = 0;
        for (int i = 0; i < array.length; i++) {
            sum_of_numbers += array[i];
        }
        System.out.println(sum_of_numbers /array.length);
    }
}
