package ru.job4j.array;

/**
 *  Дополнительная литература:
 *    а) Java 8 (или 9), Полное руководство - Герберт Шилдт. Глава 3. Массивы (стр. 94 - 101)
 *    б) Библиотека профессионала. Java. Том 1. Основы - Кей Хостманн, Гари Корнелл.  Глава 3. Массивы (стр. 116 - 129)
 *            Страницы примерные.
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}
