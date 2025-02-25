package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] test = new int[]{5, 8, 9, 10, 105, 99, 22, 222};
        int[] result = sort(test);
        for (int arrays : result) {
            System.out.print(arrays + "|");
        }
    }
}
