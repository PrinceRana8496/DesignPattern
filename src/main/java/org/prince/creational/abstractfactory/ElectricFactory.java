package org.prince.creational.abstractfactory;

public class ElectricFactory implements VehiclesFactory {
    @Override
    public Vehicles createVehicle() {
        return new ElectricCar();
    }

    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
}

