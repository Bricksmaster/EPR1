/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.uebungen.PersonCarGarage;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Maxl");
        Person person2 = new Person("Thomas");
        Car car1 = new Car("BMW", 100, person);
        Car car2 = new Car("Audi", 200, person2);
        Garage garage = new Garage("Haus");

        garage.addCar(car1);
        garage.addCar(car2);

        for (int i = 0; i < garage.getCarList().toArray().length; i++) {
            System.out.println(garage.getCarList().get(i).getModel() + " | " + garage.getCarList().get(i).getOwner().getName());
        }

    }
}
