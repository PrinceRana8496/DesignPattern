package org.prince.creational.abstractfactory;

// Abstract Factory interface
public interface VehiclesFactory {
    Vehicles createVehicle();
    Engine createEngine();
}

