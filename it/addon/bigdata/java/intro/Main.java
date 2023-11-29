package it.addon.bigdata.java.intro;

import it.addon.bigdata.java.intro.models.Point;

public class Main {

    public static void main(String[] args) {
        // Do something here
        // call other functions/methods
        hello();

        Point p1 = new Point(10, 10);
        Point p2 = new Point(4, 4);
        Point p3  = p1.center(p2);
        p3.printPoint();
    }

    private static void hello() {
        System.out.println("Hello world");
    }
}