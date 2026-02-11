package org.prince.copy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}
class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        Address newAddress=new Address(this.address.city);
        return new Person(this.name,newAddress);
//        return super.clone();
    }
}
