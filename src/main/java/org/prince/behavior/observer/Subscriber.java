package org.prince.behavior.observer;

class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println(name + " received notification: New video uploaded - " + videoTitle);
    }
}

