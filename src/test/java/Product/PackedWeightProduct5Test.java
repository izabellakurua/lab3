package Product;

import org.example.PackedWeightProduct5;
import org.example.ProductPackaging1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PackedWeightProduct5Test {

    @Test
    public void testGetNetWeight() {
        ProductPackaging1 packaging = new ProductPackaging1("Коробка", 1.0);
        PackedWeightProduct5 packedWeightProduct = new PackedWeightProduct5("Мука", "Пшеничная мука", 30.0, packaging);
        Assertions.assertEquals(30.0, packedWeightProduct.getNetWeight(), "Вес нетто должен быть равен 30.0");
    }

    @Test
    public void testGetGrossWeight() {
        ProductPackaging1 packaging = new ProductPackaging1("Коробка", 1.0);
        PackedWeightProduct5 packedWeightProduct = new PackedWeightProduct5("Мука", "Пшеничная мука", 30.0, packaging);
        Assertions.assertEquals(31.0, packedWeightProduct.getGrossWeight(), "Вес брутто должен быть равен 31.0");
    }
}
