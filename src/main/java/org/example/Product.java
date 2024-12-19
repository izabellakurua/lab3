package org.example;

import java.util.Objects;

public class Product {
    String name;
    String description;

    public Product(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
