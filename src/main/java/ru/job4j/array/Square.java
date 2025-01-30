package ru.job4j.array;

public class Square {
    public static int[] calculate(int bounde) {
        int[] result = new int[bounde];
        for (int i = 0; i < bounde; i++) {
            result[i] = i * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int arrays : array) {
            System.out.println(arrays);
        }
    }
}
