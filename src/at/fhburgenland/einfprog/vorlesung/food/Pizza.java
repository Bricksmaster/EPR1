package at.fhburgenland.einfprog.vorlesung.food;

public class Pizza extends Food{
    private final String topping;

    public Pizza(String name, double price, String topping) {
        super(name, price);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }
}
