package ru.job4j.array;

import java.util.Arrays;

/** Before refactoring:
 *  public static int[] change(int money, int price) {
 *         int[] coins = {10, 5, 2, 1};
 *         int[] result = new int[100];
 *         int size = 0;
 *         int totalChange = money - price;
 *         for (int i = 0, j = 0; i < coins.length; i++) { *
 *             while (totalChange > 0) {
 *                 if (totalChange >= coins[i]) {
 *                     result[j] = coins[i];
 *                     j++;
 *                     size++;
 *                     totalChange = totalChange - coins[i];
 *                 } else {
 *                     break;
 *                 }
 *             }
 *         }
 *         return Arrays.copyOf(result, size);
 *   }
 *   "Выполнил задание: Чтение кода и базовые ошибки [#40205]".
 */

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int iterator = 0;
        for (int coin : coins) {
            while (money - price > 0) {
                if (money - price >= coin) {
                    result[iterator] = coin;
                    iterator++;
                    size++;
                    money -= coin;
                } else {
                    break;
                }
            }
        }
        return Arrays.copyOf(result, size);
    }
}