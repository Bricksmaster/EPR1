package at.fhburgenland.einfprog.vorlesung.vehicel;

public class Vehicle {
    private final String model;
    private final double price;

    public Vehicle(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
