package it.addon.bigdata.java.exo1;

public class MyProgram {

    public static void main(String[] args) {
        Product p1;
        p1 = new Product("P1", 10);

        Product p2 = new Product("P2", 11);

        System.out.println("Produit 1 : " + p1.getName() );
    }
}
