package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int totalChange = money - price;
        for (int i = 0, j = 0; i < coins.length; i++) {

            while (totalChange > 0) {

                if (totalChange >= coins[i]) {
                    result[j] = coins[i];
                    j++;
                    size++;
                    totalChange = totalChange - coins[i];
                } else {
                    break;
                }
            }
        }
        return Arrays.copyOf(result, size);
    }

    public static void main(String[] args) {

        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        //int[] expected = {10, 10, 5, 2, 2};

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}