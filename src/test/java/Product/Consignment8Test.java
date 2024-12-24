package Product;

import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Consignment8Test {
    @Test
    void testConstructor() {
        ProductPackaging1 packaging1 = new ProductPackaging1("Box", 1.5);
        ProductPackaging1 packaging2 = new ProductPackaging1("Bag", 1.0);

        PackedWeightProduct5 weightProduct = new PackedWeightProduct5(new WeightProduct3("WeightProduct", "A heavy product"), packaging1, 10);
        PackedPieceProduct6 pieceProduct = new PackedPieceProduct6(new PieceProduct4("PieceProduct", "A small item", 0.5), 5, packaging2);

        Consignment8 consignment = new Consignment8("Test Consignment",
                Arrays.asList(weightProduct),
                Arrays.asList(pieceProduct));

        // Проверка инициализации полей
        assertEquals("Test Consignment", consignment.description);
        assertEquals(1, consignment.getWeightProducts().size());
        assertEquals(1, consignment.getProducts().size());
        assertTrue(consignment.getWeightProducts().contains(weightProduct));
        assertTrue(consignment.getProducts().contains(pieceProduct));
    }

    // Тест на метод getProducts, который возвращает список штучных товаров
    @Test
    void testGetProducts() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5);
        PackedPieceProduct6 pieceProduct = new PackedPieceProduct6(new PieceProduct4("PieceProduct", "A small item", 0.5), 5, packaging);

        Consignment8 consignment = new Consignment8("Test Consignment",
                Arrays.asList(),
                Arrays.asList(pieceProduct));

        // Проверяем, что метод getProducts возвращает правильный список
        assertEquals(1, consignment.getProducts().size());
        assertTrue(consignment.getProducts().contains(pieceProduct));
    }

    // Тест на метод getWeightProducts, который возвращает список весовых товаров
    @Test
    void testGetWeightProducts() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5);
        PackedWeightProduct5 weightProduct = new PackedWeightProduct5(new WeightProduct3("WeightProduct", "A heavy product"), packaging, 10);

        Consignment8 consignment = new Consignment8("Test Consignment",
                Arrays.asList(weightProduct),
                Arrays.asList());

        // Проверяем, что метод getWeightProducts возвращает правильный список
        assertEquals(1, consignment.getWeightProducts().size());
        assertTrue(consignment.getWeightProducts().contains(weightProduct));
    }

    // Тест на метод getTotalGrossWeight, который возвращает общую массу брутто
    @Test
    void testGetTotalGrossWeight() {
        ProductPackaging1 packaging1 = new ProductPackaging1("Box", 1.5);
        ProductPackaging1 packaging2 = new ProductPackaging1("Bag", 1.0);

        PackedWeightProduct5 weightProduct = new PackedWeightProduct5(new WeightProduct3("WeightProduct", "A heavy product"), packaging1, 10);
        PackedPieceProduct6 pieceProduct = new PackedPieceProduct6(new PieceProduct4("PieceProduct", "A small item", 0.5), 5, packaging2);

        Consignment8 consignment = new Consignment8("Test Consignment",
                Arrays.asList(weightProduct),
                Arrays.asList(pieceProduct));

        // Масса брутто для каждого товара
        double expectedGrossWeight = weightProduct.getGrossWeight() + pieceProduct.getGrossWeight();

        // Проверяем, что метод getTotalGrossWeight возвращает правильную общую массу
        assertEquals(expectedGrossWeight, consignment.getTotalGrossWeight(), 0.001);
    }
}

