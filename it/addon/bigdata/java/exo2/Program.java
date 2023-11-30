package it.addon.bigdata.java.exo2;

public class Program {

    public static void main(String[] args) {
        Cat c = new Cat("Mephisto", 10);
        Dog d = new Dog("Rex", 10);
        c.play("Boris");
        d.play("Boris");

        // CAST
        // Animal a = (Animal) d; // Dog= > Animal
    }
}
