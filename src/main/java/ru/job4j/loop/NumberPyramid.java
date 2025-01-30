package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int i1 = n + 1 - i; i1 > 0; i1--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Number pyramid of height 1:");
        draw(1);
        System.out.println("Number pyramid of height 3:");
        draw(4);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
