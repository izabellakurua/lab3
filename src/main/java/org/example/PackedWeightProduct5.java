package org.example;
//Упакованный весовой товар
public class PackedWeightProduct5 extends WeightProduct3 {
    private final double weight; //вес товара в упаковке
    private final ProductPackaging1 productPackaging;// поле для хранения объекта упаковки

    public PackedWeightProduct5(WeightProduct3 weightProduct, ProductPackaging1 productPackaging, double weight)
    {
        super(weightProduct.getName(), weightProduct.getDescription()); // объект весового товара
        this.weight = weight;//вес товара без упаковки
        this.productPackaging = productPackaging; //объект упаковки
    }

    public ProductPackaging1 getProductPackaging() {
        return productPackaging; //получение объекта упаковки
    }
    public double getNetWeight() {
        return weight; // масса нетто
    }
    public double getGrossWeight(){
        return weight + productPackaging.getWeight(); // масса брутто
    }

    @Override
    public String toString() {
        return "PackedWeightProduct{" +
                "productPackaging=" + productPackaging +
                ", weight=" + weight +
                '}';
    }
}
