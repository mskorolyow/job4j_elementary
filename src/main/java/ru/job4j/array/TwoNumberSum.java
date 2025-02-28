package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] result = new int[0];
        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0, 2, 5, 8, 10, 12};
        int[] result = getIndexes(array, 15);

        for (int index : result) {
            System.out.print(index + " ");

        }
    }
}
