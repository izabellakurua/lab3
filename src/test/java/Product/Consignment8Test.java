package Product;

import org.example.Consignment8;
import org.example.PackedWeightProduct5;
import org.example.ProductPackaging1;
import org.example.Weightable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Consignment8Test {

    @Test
    public void testGetDescription() {
        List<Weightable> products = Arrays.asList();//создаем список продуктов
        Consignment8 consignment = new Consignment8("Первая партия", products);//создаем партию товаров

        Assertions.assertEquals("Первая партия", consignment.getDescription(), "Описание должно совпадать");
    }

    @Test
    public void testGetProducts() {
        // Создаем продукты
        Weightable product1 = new PackedWeightProduct5("Product1", "Description1", 10, new ProductPackaging1("Коробка", 1));
        Weightable product2 = new PackedWeightProduct5("Product2", "Description2", 5, new ProductPackaging1("Сумка", 0.5));
        List<Weightable> products = Arrays.asList(product1, product2);

        Consignment8 consignment = new Consignment8("Первая партия", products);// Создаем партию товаров

        Assertions.assertEquals(products, consignment.getProducts(), "Список продуктов должен совпадать");// Проверяем, что список продуктов совпадает
    }

    @Test
    public void testGetTotalGrossWeight() {
        Weightable product1 = new PackedWeightProduct5("Product1", "Description1", 10, new ProductPackaging1("Коробка", 1));
        Weightable product2 = new PackedWeightProduct5("Product2", "Description2", 5, new ProductPackaging1("Сумка", 0.5));
        List<Weightable> products = Arrays.asList(product1, product2);

        Consignment8 consignment = new Consignment8("Первая партия", products);

        // Проверяем общий вес
        double expectedGrossWeight = 10 + 1 + 5 + 0.5; // 16.5
        Assertions.assertEquals(expectedGrossWeight, consignment.getTotalGrossWeight(), "Общий вес должен быть равен 16.5");
    }

    @Test
    public void testEmptyConsignment() {
        List<Weightable> emptyProducts = Arrays.asList(); // Создаем пустую партию
        Consignment8 consignment = new Consignment8("Пустая партия", emptyProducts);

        Assertions.assertEquals(0.0, consignment.getTotalGrossWeight(), "Общий вес пустой партии должен быть равен 0.0");

        Assertions.assertTrue(consignment.getProducts().isEmpty(), "Список продуктов должен быть пуст");
    }
}
