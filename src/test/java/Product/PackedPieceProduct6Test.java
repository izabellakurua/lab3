package Product;

import org.example.PackedPieceProduct6;
import org.example.PieceProduct4;
import org.example.ProductPackaging1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackedPieceProduct6Test {

    @Test
    void testConstructor() {
        // Создаем объекты упаковки и штучного товара
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5);
        PieceProduct4 pieceProduct = new PieceProduct4("Toy", "A small toy", 0.5);
        int quantity = 10; // количество товаров

        // Создаем упакованный штучный товар
        PackedPieceProduct6 packedPieceProduct = new PackedPieceProduct6(pieceProduct, quantity, packaging);

        assertEquals("Toy", packedPieceProduct.getName());
        assertEquals("A small toy", packedPieceProduct.getDescription());
        assertEquals(quantity, packedPieceProduct.getQuantity());
        assertEquals(packaging, packedPieceProduct.productPackaging);
    }

    // Тест на метод getQuantity, который возвращает количество единиц товара
    @Test
    void testGetQuantity() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5);
        PieceProduct4 pieceProduct = new PieceProduct4("Toy", "A small toy", 0.5);
        int quantity = 10;

        PackedPieceProduct6 packedPieceProduct = new PackedPieceProduct6(pieceProduct, quantity, packaging);

        // Проверяем, что метод getQuantity возвращает правильное количество товаров
        assertEquals(quantity, packedPieceProduct.getQuantity());
    }

    // Тест на метод getNetWeight, который возвращает массу нетто
    @Test
    void testGetNetWeight() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5);
        PieceProduct4 pieceProduct = new PieceProduct4("Toy", "A small toy", 0.5);
        int quantity = 10;

        PackedPieceProduct6 packedPieceProduct = new PackedPieceProduct6(pieceProduct, quantity, packaging);

        // Проверяем, что метод getNetWeight возвращает правильную массу нетто
        double expectedNetWeight = quantity * pieceProduct.getWeight();
        assertEquals(expectedNetWeight, packedPieceProduct.getNetWeight(), 0.01);
    }

    // Тест, который возвращает массу брутто
    @Test
    void testGetGrossWeight() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5);
        PieceProduct4 pieceProduct = new PieceProduct4("Toy", "A small toy", 0.5);
        int quantity = 10;

        PackedPieceProduct6 packedPieceProduct = new PackedPieceProduct6(pieceProduct, quantity, packaging);

        double expectedGrossWeight = (quantity * pieceProduct.getWeight()) + packaging.getWeight();
        assertEquals(expectedGrossWeight, packedPieceProduct.getGrossWeight(), 0.01);
    }
}

