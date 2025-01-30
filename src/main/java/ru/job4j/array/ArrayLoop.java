package ru.job4j.array;

/**
 *  for (int i = 0; i < numbers.length; i++) {
 *  System.out.println("Ячейка " + i + " массива names имеет значение: " + numbers[i]);
 *  }
 *  Меняем данный код на for-each
 */

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }

        for (int number : numbers) {
            System.out.println("Массив имеет значение: " + number);
        }
    }
}
