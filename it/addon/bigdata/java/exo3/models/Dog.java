package it.addon.bigdata.java.exo3.models;

public class Dog {

    private String name;
    private Tattoo tattoo;
    private DogHouse house; // aggregation

    public Dog() {
        this.tattoo = new Tattoo();
        //
    }

    /**
     * Commentaire JAVADOC
     * @param name
     */
    public Dog(String name) {
        /* commentaire */
        /* commentaire
           sur plusieurs lignes
         */
        this();
        this.name = name;
    }

    /**
     * Allow to display dog's tattoo
     */
    public void displayIdentity() {
        System.out.println("I am  " + this.tattoo.getNum());
    }
    public void play(Bone bone) { // use
        System.out.println("I am playing with a Bone of " + bone.getSize() + "cm");
    }

    public String getName() {
        return name;
    }

    public DogHouse getHouse() {
        return house;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouse(DogHouse house) {
        this.house = house;
    }
}
