package Interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsStringFilterTest {

    @Test
    void testApplyWithMatchingSubstring() {
        String pattern = "Hello";
        ContainsStringFilter filter = new ContainsStringFilter(pattern);

        String testString = "Hello, world!";

        // Проверяем, что метод возвращает true, если строка содержит шаблон
        assertTrue(filter.apply(testString));
    }

    @Test
    void testApplyWithNonMatchingSubstring() {
        String pattern = "Hello";
        ContainsStringFilter filter = new ContainsStringFilter(pattern);

        String testString = "Goodbye, world!";

        // Проверяем, что метод возвращает false, если строка не содержит шаблон
        assertFalse(filter.apply(testString));
    }

    @Test
    void testApplyWithEmptyString() {
        String pattern = "Hello";
        ContainsStringFilter filter = new ContainsStringFilter(pattern);

        String testString = "";

        // Проверяем, что метод возвращает false, если строка пуста
        assertFalse(filter.apply(testString));
    }


    // Тест на метод apply с шаблоном, который полностью совпадает с строкой
    @Test
    void testApplyWithEqualStrings() {
        String pattern = "Test";
        ContainsStringFilter filter = new ContainsStringFilter(pattern);

        String testString = "Test";

        // Проверяем, что метод возвращает true, если строка полностью совпадает с шаблоном
        assertTrue(filter.apply(testString));
    }

    // Тест на метод apply с шаблоном, который является частью строки
    @Test
    void testApplyWithSubstring() {
        String pattern = "lo";
        ContainsStringFilter filter = new ContainsStringFilter(pattern);

        String testString = "Hello";

        // Проверяем, что метод возвращает true, если строка содержит шаблон
        assertTrue(filter.apply(testString));
    }
}
