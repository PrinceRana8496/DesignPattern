package org.prince.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // Create a petrol vehicle family
        System.out.println("=== Petrol Vehicle Family ===");
        VehiclesFactory petrolFactory = new PetrolFactory();
        Vehicles petrolVehicle = petrolFactory.createVehicle();
        Engine petrolEngine = petrolFactory.createEngine();
        petrolVehicle.drive();
        petrolEngine.start();

        System.out.println();

        // Create an electric vehicle family
        System.out.println("=== Electric Vehicle Family ===");
        VehiclesFactory electricFactory = new ElectricFactory();
        Vehicles electricVehicle = electricFactory.createVehicle();
        Engine electricEngine = electricFactory.createEngine();
        electricVehicle.drive();
        electricEngine.start();
    }
}

