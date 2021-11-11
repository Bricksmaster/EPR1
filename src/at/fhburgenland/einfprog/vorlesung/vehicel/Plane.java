package at.fhburgenland.einfprog.vorlesung.vehicel;

public class Plane extends Vehicle{
    private final int passengers;

    public int getPassengers() {
        return passengers;
    }

    public Plane(String model, double price, int passengers) {
        super(model, price);
        this.passengers = passengers;
    }
}
