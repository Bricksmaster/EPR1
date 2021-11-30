/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung.orderPizza;

public class MainOrder {
    public static void main(String[] args) {
        String name = "hugo";

        Pizza pizza1 = new Pizza("Margarita", 7);
        Order order1 = new Order("Joe");
        order1.addPizza(pizza1);
        order1.addPizza(new Pizza("Salami", 8.50));

        System.out.println("Bestellung für " + order1.getCustomerName());
        double total = 0;
        for (Pizza pizza : order1.getPizzas()){
            System.out.println(pizza.getName() + " " + pizza.getPrice());
            total += pizza.getPrice();
        }

        System.out.println("Zu bezahlen: €" + total);

        for (Pizza pizza : order1.getPizzas()){

        }
    }
}
