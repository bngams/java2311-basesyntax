package it.addon.bigdata.java.intro.models;
public class Personne {
    private String name;

    // new it.addon.bigdata.java.intro.models.Personne("Boris")
    public Personne(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void saHyello() {
        // <type> nom variable  = asigsnation de valeur
        String hello = "Hello, my name is ";
        System.out.println(hello + this.name);
    }
}
