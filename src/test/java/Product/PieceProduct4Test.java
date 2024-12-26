package Product;

import org.example.PieceProduct4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PieceProduct4Test {

    @Test
    void testConstructor() {
        PieceProduct4 product = new PieceProduct4("Игрушка", "Маленькая игрушка", 0.5);

        assertEquals("Игрушка", product.getName());
        assertEquals("Маленькая игрушка", product.getDescription());
        assertEquals(0.5, product.getWeight(), 0.01); // Допускаем погрешность в 0.01 при проверке весов
    }

    @Test
    void testGetWeight() {
        PieceProduct4 product = new PieceProduct4("Игрушка", "Маленькая игрушка", 0.5);
        assertEquals(0.5, product.getWeight(), 0.01);
    }
}
