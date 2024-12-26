package Product;

import org.example.WeightProduct3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeightProduct3Test {

    @Test
    void testConstructor() {
        WeightProduct3 product = new WeightProduct3("Мука", "Пшеничная мука");

        // Проверяем значения имени и описания
        assertEquals("Мука", product.getName());
        assertEquals("Пшеничная мука", product.getDescription());
    }
}
