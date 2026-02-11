package org.prince.creational.prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIpAddress("192.168.1.2");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);
        try {
            NetworkConnection  networkConnection2 = (NetworkConnection)networkConnection.clone();
            System.out.println(networkConnection2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
