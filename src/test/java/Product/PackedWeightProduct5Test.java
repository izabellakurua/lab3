package Product;

import org.example.PackedWeightProduct5;
import org.example.ProductPackaging1;
import org.example.WeightProduct3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackedWeightProduct5Test {
    @Test
    void testConstructor() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5); // создаем упаковку с весом
        WeightProduct3 weightProduct = new WeightProduct3("Toy", "A small toy") {}; // создаем весовой товар
        double weight = 2.0; // вес товара

        PackedWeightProduct5 packedProduct = new PackedWeightProduct5(weightProduct, packaging, weight);


        assertEquals("Toy", packedProduct.getName());
        assertEquals("A small toy", packedProduct.getDescription());
        assertEquals(weight, packedProduct.getNetWeight(), 0.01);
        assertEquals(packaging, packedProduct.getProductPackaging());
    }

    // Тест на метод getNetWeight, который возвращает массу нетто товара
    @Test
    void testGetNetWeight() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5);
        WeightProduct3 weightProduct = new WeightProduct3("Toy", "A small toy") {};
        double weight = 2.0;

        PackedWeightProduct5 packedProduct = new PackedWeightProduct5(weightProduct, packaging, weight);

        // Проверяем, что метод getNetWeight возвращает правильную массу нетто
        assertEquals(weight, packedProduct.getNetWeight(), 0.01);
    }

    // Тест на метод getGrossWeight, который возвращает массу брутто товара (включая упаковку)
    @Test
    void testGetGrossWeight() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.5);
        WeightProduct3 weightProduct = new WeightProduct3("Toy", "A small toy") {};
        double weight = 2.0;

        PackedWeightProduct5 packedProduct = new PackedWeightProduct5(weightProduct, packaging, weight);

        assertEquals(weight + packaging.getWeight(), packedProduct.getGrossWeight(), 0.01);
    }
}

