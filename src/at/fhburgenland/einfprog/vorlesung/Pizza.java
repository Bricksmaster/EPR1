package at.fhburgenland.einfprog.vorlesung;

public class Pizza {
    private final String name;
    private final double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public static void main(String[] args) {
        Pizza margarita = new Pizza ( "Margarita", 7.5);
        Pizza salami = new Pizza( "Salami",  9.2);

        System.out.println("Sie haben folgende Auswahl:");
        System.out.println(margarita.getName() + "kostet "+ margarita.getPrice());
    }

}
