package it.addon.bigdata.java.exo1;

// toutes les clsases hééritent de Object
// public class Product extends Object
public class Product {

    private String name;
    private Integer num;
    private String provider;

    public Product() {
        super(); // constructeur parent
        this.provider = "me";
    }

    public Product(String name, Integer num) {
        this();
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return this.num;
    }
}
