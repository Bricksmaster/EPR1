package at.fhburgenland.einfprog.vorlesung.food;

public class Fish extends Food{
    private final double weight;

    public Fish(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
