package it.addon.bigdata.java.exo2;

public class Dog extends Animal {

    public Dog(String nom, Integer age) {
        super(nom, age);
    }

    @Override
    public void play(String buddy) {
        System.out.println("Ouaf!" );
        super.play(buddy);
    }
}
