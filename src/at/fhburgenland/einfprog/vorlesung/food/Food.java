package at.fhburgenland.einfprog.vorlesung.food;

public class Food {
    private final String name;
    private final double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
