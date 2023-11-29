package it.addon.bigdata.java.intro.models;

public class Point {
    private int x;
    private int y;

    // constructeur => new Point()
    public Point() {
    }

    // constructeur "surchargé" => new Point(1, 2);
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // accesseurs
    public int getX() {
        return this.x;
    }

    public void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }

    public Point center(Point other) {
        // Returns the center between this point the other point
        // Notice we are using integer, we won't get an accurate value
        return new Point((this.x + other.x) / 2, (this.y + other.y) / 2);
    }
}