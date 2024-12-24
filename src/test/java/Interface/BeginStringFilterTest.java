package Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {

    // Тест на правильность инициализации фильтра
    @Test
    void testConstructor() {
        String pattern = "Hello";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        // Проверяем, что фильтр правильно инициализируется с шаблоном
        assertNotNull(filter);
    }

    // Тест на метод apply, который проверяет, начинается ли строка с шаблона
    @Test
    void testApplyWithMatchingString() {
        String pattern = "Hello";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "Hello, world!";

        // Проверяем, что метод возвращает true, если строка начинается с шаблона
        assertTrue(filter.apply(testString));
    }

    // Тест на метод apply, когда строка не начинается с шаблона
    @Test
    void testApplyWithNonMatchingString() {
        String pattern = "Hello";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "Goodbye, world!";

        // Проверяем, что метод возвращает false, если строка не начинается с шаблона
        assertFalse(filter.apply(testString));
    }

    // Тест на метод apply с пустой строкой
    @Test
    void testApplyWithEmptyString() {
        String pattern = "Hello";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "";

        // Проверяем, что метод возвращает false, если строка пуста
        assertFalse(filter.apply(testString));
    }

    // Тест на метод apply с пустым шаблоном
    @Test
    void testApplyWithEmptyPattern() {
        String pattern = "";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "Hello, world!";

        // Проверяем, что метод возвращает true, если шаблон пустой (любая строка начинается с пустого шаблона)
        assertTrue(filter.apply(testString));
    }

    // Тест на метод apply с одинаковыми строками
    @Test
    void testApplyWithEqualStrings() {
        String pattern = "Test";
        BeginStringFilter filter = new BeginStringFilter(pattern);

        String testString = "Test";

        // Проверяем, что метод возвращает true, если строка полностью совпадает с шаблоном
        assertTrue(filter.apply(testString));
    }
}
