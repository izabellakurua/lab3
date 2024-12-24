package Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {



    @Test
    void testApplyWithMatchingString() {
        String pattern = "Hello";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "Hello, world!";

        // Проверяем, что метод возвращает true, если строка начинается с шаблона
        assertTrue(filter.apply(testString));
    }

    @Test
    void testApplyWithNonMatchingString() {
        String pattern = "Hello";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "Goodbye, world!";

        // Проверяем, что метод возвращает false, если строка не начинается с шаблона
        assertFalse(filter.apply(testString));
    }

    @Test
    void testApplyWithEmptyString() {
        String pattern = "Hello";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "";

        // Проверяем, что метод возвращает false, если строка пуста
        assertFalse(filter.apply(testString));
    }


    @Test
    void testApplyWithEqualStrings() {
        String pattern = "Test";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "Test";

        // Проверяем, что метод возвращает true, если строка полностью совпадает с шаблоном
        assertTrue(filter.apply(testString));
    }
}
