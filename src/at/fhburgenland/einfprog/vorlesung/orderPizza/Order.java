/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung.orderPizza;

import java.util.ArrayList;

public class Order {
    private final String customerName;
    private final ArrayList<Pizza> pizzas = new ArrayList<>();

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public void deliver(){
        System.out.println("Bestellung für " + getCustomerName() + " wird ausgeliefert");
    }

    public void bake(){
        System.out.println("Pizza " + getPizzas() + " wird zubereitet");
    }
}
