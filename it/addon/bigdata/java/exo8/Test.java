package it.addon.bigdata.java.exo8;

public class Test {

    private static Test test;

    Test() {
        System.out.println("Instanciation");
    }

    public static void main(String[] args) {
        System.out.println(test.sayStatic());

        Test t = new Test();
        t.sayHello();
    }

    public String sayHello() {
        return "Hello";
    }

    public static String sayStatic() {
        return "Hello static";
    }

}
