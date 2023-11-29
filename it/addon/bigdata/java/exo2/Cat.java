package it.addon.bigdata.java.exo2;

public class Cat extends Animal {
    public Cat(String nom, Integer age) {
        super(nom, age);
    }

    @Override
    public void play(String buddy) {
        System.out.println("Miaowww!" );
        super.play(buddy);
    }
}
