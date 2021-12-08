/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.uebungen.PersonCarGarage;

import java.util.ArrayList;

public class Garage {
    private final String name;
    private final ArrayList<Car> carList = new ArrayList<>();


    public Garage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCar (Car car){
        carList.add(car);
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }
}