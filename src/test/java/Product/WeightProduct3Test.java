package Product;

import org.example.Product2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeightProduct3Test {

    private Product2 product2;

    @Test
    void testConstructor() {
        WeightProduct3Test product = new WeightProduct3Test();
        assertEquals("Flour", product2.getName());
        assertEquals("Fine wheat flour", product2.getDescription());
    }
}
