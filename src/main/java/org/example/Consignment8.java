package org.example;
//Партия товаров
import java.util.List;

public class Consignment8 {
    public String description;
    private List<PackedWeightProduct5> weightProducts;//Каждый элемент списка представляет отдельный упакованный весовой товар
    private List<PackedPieceProduct6> Products;// Каждый элемент списка представляет отдельный упакованный штучный товар

    public Consignment8(String description, List<PackedWeightProduct5> weightProducts, List<PackedPieceProduct6> Products) {
        this.description = description;//описание партии
        this.weightProducts = weightProducts;//список упакованных весовых товаров
        this.Products = Products;//список упакованных штучных товаров
    }

    public List<PackedPieceProduct6> getProducts() {
        return Products;
    }

    public List<PackedWeightProduct5> getWeightProducts() {
        return weightProducts;
    }

    public double getTotalGrossWeight() { //общая масса брутто всех товаров в партии
        double totalWeight = 0;//для хранения всех товаров в партии
        for (PackedWeightProduct5 p : weightProducts) {
            totalWeight += p.getGrossWeight();
        }
        for (PackedPieceProduct6 p : Products) {
            totalWeight += p.getGrossWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Consignment{" +
                "description='" + description + '\'' +
                ", weightProducts=" + weightProducts +
                ", Products=" + Products +
                '}';
    }
}

