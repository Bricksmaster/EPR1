package at.fhburgenland.einfprog.vorlesung.food;

public class Main {
    public static void main(String[] args) {
        Food food = new Food("Hühnchen mit Reis", 6.50);
        System.out.println("Ich brauch " + food.getName() +
                " und es kostet mich " + food.getPrice() + " €");

        Pizza pizza = new Pizza("ScamPizza", 6.40, "PolloDeReiso");
        System.out.println("Was ist das für eine " + pizza.getName() + " für " +
                pizza.getPrice() + " da fehlt mein " + pizza.getTopping() + " Belag!");

        Fish fish = new Fish ("Nemo", 99, 1000);
        System.out.println("Dieser Fish namens " + fish.getName() + " kostet " +
                fish.getPrice() + " und wiegt mit " + fish.getWeight() + " locker ne Tonne");

    }

}
