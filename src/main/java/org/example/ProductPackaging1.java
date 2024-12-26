package org.example;

import java.util.Objects;

public class ProductPackaging1 {
    private final String name;
    private final double weight; // weight of the packaging in kg

    public ProductPackaging1(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPackaging1 that = (ProductPackaging1) o;
        return Double.compare(that.weight, weight) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "ProductPackaging{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
