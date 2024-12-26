package Service;

import Interface.Filter;
import Interface.ContainsStringFilter;
import org.example.Consignment8;
import org.example.PackedWeightProduct5;
import org.example.ProductPackaging1;
import org.example.Weightable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ProductServiceTest {

    @Test
    public void testCountByFilter_Match() {
        Weightable product1 = new PackedWeightProduct5("Яблоко", "Свежее яблоко", 1, new ProductPackaging1("Сумка", 0.1));
        Weightable product2 = new PackedWeightProduct5("Банан", "Спелый банан", 1.5, new ProductPackaging1("Коробка", 0.2));
        Weightable product3 = new PackedWeightProduct5("Яблоко-сок", "Натуральный яблочный сок", 2, new ProductPackaging1("Бутылка", 0.5));

        List<Weightable> products = Arrays.asList(product1, product2, product3); // Создаем партию товаров
        Consignment8 consignment = new Consignment8("Партия фруктов", products);

        Filter filter = new ContainsStringFilter("Яблоко"); // Используем фильтр для поиска продуктов, содержащих "Яблоко"
        int count = ProductService.countByFilter(consignment, filter);

        Assertions.assertEquals(2, count, "Должно быть 2 продукта, содержащих 'Яблоко' в названии");
    }

    @Test
    public void testCountByFilter_NoMatch() {
        // Создаем продукты
        Weightable product1 = new PackedWeightProduct5("Яблоко", "Свежее яблоко", 1, new ProductPackaging1("Сумка", 0.1));
        Weightable product2 = new PackedWeightProduct5("Банан", "Спелый банан", 1.5, new ProductPackaging1("Коробка", 0.2));

        List<Weightable> products = Arrays.asList(product1, product2);
        Consignment8 consignment = new Consignment8("Партия фруктов", products);

        // Используем фильтр для поиска продуктов, содержащих "Апельсин"
        Filter filter = new ContainsStringFilter("Апельсин");
        int count = ProductService.countByFilter(consignment, filter);

        // Проверяем количество найденных продуктов
        Assertions.assertEquals(0, count, "Не должно быть найдено продуктов, содержащих 'Orange' в названии");
    }

    @Test
    public void testCountByFilter_EmptyConsignment() {
        List<Weightable> products = Arrays.asList();// Создаем пустую партию
        Consignment8 consignment = new Consignment8("Пустая партия", products);

        Filter filter = new ContainsStringFilter("Яблоко");
        int count = ProductService.countByFilter(consignment, filter);

        Assertions.assertEquals(0, count, "Не должно быть найдено продуктов в пустой партии");
    }
}
