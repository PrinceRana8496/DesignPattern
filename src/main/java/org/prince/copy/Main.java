package org.prince.copy;

public class Main {
    public static void main(String[] args) throws Exception {

        Address addr = new Address("Delhi");
        Person p1 = new Person("Prince", addr);

        Person p2 = (Person) p1.clone();  // deep copy

        p2.address.city = "Mumbai";

        System.out.println(p1.address.city);  // Delhi
        System.out.println(p2.address.city);  // Mumbai
    }
}
