package it.addon.bigdata.java.exo2;

public class Cat extends Animal {
    public Cat(String nom, Integer age) {
        // call "parent" constructor
        super(nom, age);
    }

    @Override
    public void play(String buddy) {
        System.out.println("Miaoww!");
        // call "parent" method
        super.play(buddy);
    }
}
