package org.oop;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point from, Point to) {
        double xDistance = getXDistance(to.x, from.x);
        double yDistance = getYDistance(to.y, from.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    private static double getYDistance(int y, int y2) {
        return y - y2;
    }

    private static double getXDistance(int x, int x2) {
        return x - x2;
    }

    public static double direction(Point from, Point to) {
        double xDistance = getYDistance(to.x, from.x);
        double yDistance = getXDistance(to.y, from.y);
        return Math.atan2(yDistance, xDistance);
    }

}