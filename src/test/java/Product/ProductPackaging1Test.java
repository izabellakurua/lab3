package Product;

import org.example.ProductPackaging1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductPackaging1Test {

    @Test
    void testGetName() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.2);
        assertEquals("Box", packaging.getName());
    }

    @Test
    void testGetWeight() {
        ProductPackaging1 packaging = new ProductPackaging1("Box", 1.2);
        assertEquals(1.2, packaging.getWeight());
    }
}
