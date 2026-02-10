package org.prince.creational;

public class Singleton {
    private String name;
    private static Singleton instances;

    private Singleton() {
        System.out.println("Singleton class constructor called");
    }
    public static Singleton getInstanes() {
        if(instances == null) {
            instances = new Singleton();
        }
        return instances;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}


 class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstanes();
        Singleton singleton2 = Singleton.getInstanes();
        System.out.println(singleton1);
        System.out.println(singleton1);
    }
}
