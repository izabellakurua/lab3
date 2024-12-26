package org.example;

public class PackedPieceProduct6 extends PieceProduct4 implements Weightable {
    private final int quantity;
    private final ProductPackaging1 productPackaging;

    public PackedPieceProduct6(PieceProduct4 product, int quantity, ProductPackaging1 productPackaging) {
        super(product.getName(), product.getDescription(), product.getWeight());
        this.quantity = quantity;
        this.productPackaging = productPackaging;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double getNetWeight() {
        return quantity * getWeight();
    }

    @Override
    public double getGrossWeight() {
        return getNetWeight() + productPackaging.getWeight();
    }
}