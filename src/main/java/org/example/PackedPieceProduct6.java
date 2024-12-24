package org.example;
//упакованный штучный товар
public class PackedPieceProduct6 extends PieceProduct4 implements Weightable {
    private final int quantity;
    public final ProductPackaging1 productPackaging;

    public PackedPieceProduct6(PieceProduct4 product, int quantity, ProductPackaging1 productPackaging) {
        super(product.getName(), product.getDescription(), product.getWeight());
        this.quantity = quantity; //количество единиц штучного товара
        this.productPackaging = productPackaging;//хранение объекта упаковки товара
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public double getNetWeight() {
        return quantity * this.getWeight();//масса нетто
    }

    @Override
    public double getGrossWeight() {
        return quantity * this.getWeight() + this.productPackaging.getWeight();// масса брутто
    }
}