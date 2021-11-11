package at.fhburgenland.einfprog.vorlesung.vehicel;

public class Boat extends Vehicle{
    private final double weight;

    public Boat(String model, double price, double weight) {
        super(model, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
