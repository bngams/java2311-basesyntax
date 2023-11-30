package it.addon.bigdata.java.intro.models;

public class Calcul /* extends Object */ {

    /*
    public Calcul() {
        super();
    }
    */

    public int divide(int a, int b) throws CalculException, ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if(a <= 0) {
            throw new CalculException("a must be > 0");
        }
        return a / b;
    }

    public int divideWithTryCatch(int a, int b)  {
        try {
            return a / b;
        } catch(Exception e) {
            return 0;
        }
    }
}
