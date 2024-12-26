package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackedPieceProduct6Test {

    @Test
    public void testGetNetWeight() {
        PieceProduct4 product = new PieceProduct4("Конфета", "Шоколадная конфета", 0.05);
        ProductPackaging1 packaging = new ProductPackaging1("Сумка", 0.2);
        PackedPieceProduct6 packedPieceProduct = new PackedPieceProduct6(product, 10, packaging);
        Assertions.assertEquals(0.5, packedPieceProduct.getNetWeight(), "Вес нетто должен быть равен 0.5");
    }

    @Test
    public void testGetGrossWeight() {
        PieceProduct4 product = new PieceProduct4("Конфета", "Шоколадная конфета", 0.05);
        ProductPackaging1 packaging = new ProductPackaging1("Сумка", 0.2);
        PackedPieceProduct6 packedPieceProduct = new PackedPieceProduct6(product, 10, packaging);

        Assertions.assertEquals(0.7, packedPieceProduct.getGrossWeight(), "Вес брутто должен быть равен 0.7");
    }

    @Test
    public void testGetQuantity() {
        PieceProduct4 product = new PieceProduct4("Конфета", "Шоколадная конфета", 0.05); // Создаем штучный продукт

        ProductPackaging1 packaging = new ProductPackaging1("Сумка", 0.2);// Создаем упаковку

        PackedPieceProduct6 packedPieceProduct = new PackedPieceProduct6(product, 15, packaging);// Создаем упакованный продукт
        
        Assertions.assertEquals(15, packedPieceProduct.getQuantity(), "Количество должно быть равно 15");
    }

}
