package org.example;

public class PackedWeightProduct5 extends WeightProduct3 implements Weightable {
    private final double weight;
    private final ProductPackaging1 productPackaging;

    public PackedWeightProduct5(String name, String description, double weight, ProductPackaging1 productPackaging) {
        super(name, description);
        this.weight = weight;
        this.productPackaging = productPackaging;
    }

    public ProductPackaging1 getProductPackaging() {
        return productPackaging;
    }

    @Override
    public double getNetWeight() {
        return weight;
    }

    @Override
    public double getGrossWeight() {
        return weight + productPackaging.getWeight();
    }

    @Override
    public String toString() {
        return "PackedWeightProduct{" +
                "weight=" + weight +
                ", productPackaging=" + productPackaging +
                '}';
    }
}