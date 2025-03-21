package ru.job4j.condition;

import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return Math.sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);

        Point c1 = new Point(1, 2, 3);
        Point c2 = new Point(4, 5, 6);

        double distance = a.distance(b);
        double distance3d = c1.distance3d(c2);
        System.out.println(distance);
        System.out.println(distance3d);
    }
}
