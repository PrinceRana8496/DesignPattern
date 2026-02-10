package org.prince.creational.abstractfactory;

public class PetrolFactory implements VehiclesFactory {
    @Override
    public Vehicles createVehicle() {
        return new PetrolCar();
    }

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }
}

