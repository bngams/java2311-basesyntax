package it.addon.bigdata.java.exo3;

import it.addon.bigdata.java.exo3.models.Bone;
import it.addon.bigdata.java.exo3.models.Dog;
import it.addon.bigdata.java.exo3.models.DogHouse;

public class Start {

    public static void main(String[] args) {
        Bone tbone = new Bone(17);
        DogHouse dogHouse = new DogHouse("blue");
        Dog dog1 = new Dog("rex");
        Dog dog2 = new Dog("rexy");
        dog1.displayIdentity();
        dog2.displayIdentity();

        dog1.play(tbone);
        dog2.play(tbone);

        dog1.setHouse(dogHouse);
    }
}
