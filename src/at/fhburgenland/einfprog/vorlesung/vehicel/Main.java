package at.fhburgenland.einfprog.vorlesung.vehicel;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 30000, 6.3);
        System.out.println("My " + car.getModel() +
                " costs " + car.getPrice() + " and consumes " + car.getFuelConsumption()
                + " l/100km");
        Plane plane = new Plane("Airbus", 200000, 234);
        System.out.println(plane.getModel() + " can transport " + plane.getPassengers()
                + " passengers");

    }
}
