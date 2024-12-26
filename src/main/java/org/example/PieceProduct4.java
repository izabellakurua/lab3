package org.example;

public class PieceProduct4 extends Product2 {
    private final double weight;

    public PieceProduct4(String name, String description, double weight) {
        super(name, description);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "PieceProduct{" +
                "weight=" + weight +
                '}';
    }
}