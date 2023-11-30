package it.addon.bigdata.java.intro.models;

public class MainWithExceptions {

    public static void main(String[] args) {
        // premier traitement avec try/catch
        int a = 1;
        int b = 0;

        try {
            int result1 =  a + b;
            int result2 = a / b;
        } catch(Exception e) {
            // e.printStackTrace(); // journaliser
            System.out.println("Error occured");
        }
        System.out.println("continue");

        // appeller methode (throws)
        Calcul c = new Calcul();
        try {
            c.divide(1, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Calcul c2 = new Calcul();
        try {
            c2.divide(1, b);
        } catch (ArithmeticException | CalculException e)  {
            System.out.println(e.getMessage());
        }

    }
}
