package org.example;

import java.util.List;

public class Consignment8 {
    private final String description;
    private final List<Weightable> products;

    public Consignment8(String description, List<Weightable> products) {
        this.description = description;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public List<Weightable> getProducts() {
        return products;
    }

    public double getTotalGrossWeight() {
        return products.stream().mapToDouble(Weightable::getGrossWeight).sum();
    }

    @Override
    public String toString() {
        return "Consignment{" +
                "description='" + description + '\'' +
                ", products=" + products +
                '}';
    }
}