package it.addon.bigdata.java.intro;

import it.addon.bigdata.java.intro.models.Personne;

import java.util.ArrayList;
import java.util.HashSet;

public class App {

    // creer des attributs

    // methode main
    public static void main(String[] args) {
        // créer des variables
        String name; // déclaration
        name = "Boris"; // assignation


        // types objects
        String otherName = "Boris";
        String hello = "Hello, my name is ";
        Boolean b = true;
        Integer i = 10;
        Long l = 10L;
        Double d = 10.5;
        Float f = 10.5f;

        // types primitifs
        char[] helloPrim = {'h', 'e', 'l', 'l', 'o'};
        int iprim = 10;
        long lprim = 10L;
        double dprim = 10.5;
        float fprim = 10.5f;
        boolean bprim = true;


        // type objet
        Personne p1 = new Personne("Boris");
        System.out.println("Hello " + p1.getName());
        p1.saHyello();
        // /!\ JAVA 9/11
        // var => JAVA déduit le type lui meme
        var p2 = new Personne("Boris");
        // p2 = 10; // p2 reste typée


        // instructions JAVA
        // structures conditionnelles
        if(name.length() > 0) {
            System.out.println("Hello " + name);
        }

        // boucles
        for (int j = 0; j < helloPrim.length ; j++) {
            System.out.println(helloPrim[j]);
        }


        // tableaux primitifs => []
        int[] numbersPrim = {1, 2, 3}; // tableau "primitif" [] qui stock des int (type primitif)
        Integer[] numbers = {1, 2 ,3}; // tableau "primitif" [] qui sotck des types Integer (type object)

        // collections => "tableaux objets"
        ArrayList<Integer> numbersCollection = new ArrayList<>();
        numbersCollection.add(1);

        // String[] <=> ArrayList<String> <=> ArrayList<T>
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("!");

        words.indexOf("!");
        words.contains("!");

        // Set => élimine les doublons
        HashSet<String> wordsSet = new HashSet<>();
        wordsSet.add("World");
        wordsSet.add("World");

    }

}

