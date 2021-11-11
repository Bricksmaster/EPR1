package at.fhburgenland.einfprog.vorlesung.food;

public class Sushi extends Food{
    private final int pieces;

    public Sushi(String name, double price, int pieces) {
        super(name, price);
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }
}
