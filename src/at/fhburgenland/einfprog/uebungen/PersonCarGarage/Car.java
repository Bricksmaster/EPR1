/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.uebungen.PersonCarGarage;

public class Car {
    private final String model;
    private final int kW;
    private Person owner;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", kW=" + kW +
                ", owner=" + owner +
                '}';
    }

    public Person getOwner() {
        return owner;
    }

    public Car(String model, int kW, Person owner) {
        this.model = model;
        this.kW = kW;
        this.owner = owner;
    }

    public String getModel() {

        return model;
    }
    public int getkW() {
        return kW;
    }


}
