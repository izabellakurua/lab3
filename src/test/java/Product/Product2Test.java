package Product;

import org.example.Product2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Product2Test {

    @Test
    void testGetName() {
        Product2 product = new Product2("Яблоко", "Свежие зеленые яблоки");
        assertEquals("Яблоко", product.getName());
    }

    @Test
    void testGetDescription() {
        Product2 product = new Product2("Яблоко", "Свежие зеленые яблоки");
        assertEquals("Свежие зеленые яблоки", product.getDescription());
    }
}
