package it.addon.bigdata.java.exo2;

public abstract class Animal {

    String name;
    Integer age;

    public Animal() {
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void play(String buddy) {
        System.out.println("I am playing with " + buddy);
    }

    @Override
    public boolean equals(Object o) {
        // si l'object o est de type animal
        if(o instanceof Animal) {
            Animal a = (Animal) o; //obligatoire pour acc�der � la propri�t� name (ou � la m�thode getName()) de l'objet r�f�renc� par o
			/*Question)
			la r�ponse est non car la casse des 2 cha�nes diff�rent (Felix et felix) et donc les 2 cha�nes ne sont
			pas consid�r�es �gales et donc les 2 animaux ne sont pas consid�r�s egaux.
			*/
            return this.name.equals(a.name);

        } else return false; // sinon je renvoie faux
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
