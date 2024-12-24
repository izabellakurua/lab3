package Service;

import Interface.ContainsStringFilter;
import Interface.Filter;
import org.example.Consignment8;
import org.example.PackedPieceProduct6;
import org.example.PackedWeightProduct5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    private Consignment8 consignment;

    @BeforeEach
    void setUp() {
        // Создаем несколько товаров для тестирования
        PackedWeightProduct5 weightProduct1 = new PackedWeightProduct5(new org.example.WeightProduct3("Weight Product 1", "Description 1"), new org.example.ProductPackaging1("Box", 1.5), 10.0);
        PackedWeightProduct5 weightProduct2 = new PackedWeightProduct5(new org.example.WeightProduct3("Weight Product 2", "Description 2"), new org.example.ProductPackaging1("Box", 1.5), 12.0);

        PackedPieceProduct6 pieceProduct1 = new PackedPieceProduct6(new org.example.PieceProduct4("Piece Product 1", "Description 3", 0.5), 5, new org.example.ProductPackaging1("Wrap", 0.2));
        PackedPieceProduct6 pieceProduct2 = new PackedPieceProduct6(new org.example.PieceProduct4("Piece Product 2", "Description 4", 0.6), 10, new org.example.ProductPackaging1("Bag", 0.3));

        List<PackedWeightProduct5> weightProducts = Arrays.asList(weightProduct1, weightProduct2);
        List<PackedPieceProduct6> pieceProducts = Arrays.asList(pieceProduct1, pieceProduct2);

        // Инициализируем Consignment8
        consignment = new Consignment8("Consignment 1", weightProducts, pieceProducts);
    }

    // Тест на countByFilter с фильтром, который ищет по части строки
    @Test
    void testCountByFilter_withContainsStringFilter() {
        ContainsStringFilter filter = new ContainsStringFilter("Product");

        // Проверяем, что фильтр найдет 4 товара с именами, содержащими "Product"
        int result = ProductService.countByFilter(consignment, filter);

        assertEquals(4, result);
    }

    // Тест на countByFilter с фильтром, который не находит совпадений
    @Test
    void testCountByFilter_withNoMatches() {
        ContainsStringFilter filter = new ContainsStringFilter("Nonexistent");

        // Проверяем, что фильтр не найдет никаких товаров
        int result = ProductService.countByFilter(consignment, filter);

        assertEquals(0, result);
    }

    // Тест на countByFilter с пустым фильтром, который всегда возвращает true
    @Test
    void testCountByFilter_withAlwaysTrueFilter() {
        Filter filter = str -> true; // Фильтр всегда возвращает true

        // Проверяем, что все товары будут посчитаны
        int result = ProductService.countByFilter(consignment, filter);

        // У нас 2 весовых товара и 2 штучных товара, всего 4 товара
        assertEquals(4, result);
    }

    // Тест на countByFilter с пустой партией товаров
    @Test
    void testCountByFilter_withEmptyConsignment() {
        List<PackedWeightProduct5> emptyWeightProducts = Arrays.asList();
        List<PackedPieceProduct6> emptyPieceProducts = Arrays.asList();

        Consignment8 emptyConsignment = new Consignment8("Empty Consignment", emptyWeightProducts, emptyPieceProducts);

        ContainsStringFilter filter = new ContainsStringFilter("Product");

        // Проверяем, что метод возвращает 0, так как в партии нет товаров
        int result = ProductService.countByFilter(emptyConsignment, filter);

        assertEquals(0, result);
    }

    // Тест на countByFilter с фильтром, который ищет по полному имени товара
    @Test
    void testCountByFilter_withExactNameMatch() {
        ContainsStringFilter filter = new ContainsStringFilter("Piece Product 1");

        // Проверяем, что фильтр находит только 1 товар, у которого имя совпадает с "Piece Product 1"
        int result = ProductService.countByFilter(consignment, filter);

        assertEquals(1, result);
    }

}
