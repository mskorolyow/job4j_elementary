package ru.job4j.condition;

public class Max {
    private int a;
    private int b;
    private int c;
    private int d;

    public Max(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Max(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Max(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return a > max(b, c) ? a : max(b, c);
    }

    public int max(int a, int b, int c, int d) {
        return max(a, b) > max(c, d) ? max(a, b) : max(c, d);
    }
}
