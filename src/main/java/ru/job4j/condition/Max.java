package ru.job4j.condition;

public class Max {

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }
}
