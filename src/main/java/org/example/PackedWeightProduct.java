package org.example;

public class PackedWeightProduct extends WeightProduct {
    private double weight;
    private ProductPackaging productPackaging;

    public PackedWeightProduct(WeightProduct weightProduct, ProductPackaging productPackaging, double weight)
    {
        super(weightProduct.getName(), weightProduct.getDescription());
        this.weight = weight;
        this.productPackaging = productPackaging;
    }

    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    public double getWeight() {
        return weight;
    }
}
