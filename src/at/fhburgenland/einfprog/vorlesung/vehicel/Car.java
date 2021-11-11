package at.fhburgenland.einfprog.vorlesung.vehicel;

public class Car extends Vehicle{
    private final double fuelConsumption;

    public Car(String model, double price, double fuelConsumption) {
        super(model, price);
        //super ruft den vehicle Konstruktor auf
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
