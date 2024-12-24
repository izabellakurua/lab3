package Interface;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EndStringFilterTest {


    @Test
    void testConstructor() {
        String pattern = "world!";
        EndStringFilter filter = new EndStringFilter(pattern);


        assertNotNull(filter);
    }


    @Test
    void testApplyWithMatchingEnding() {
        String pattern = "world!";
        EndStringFilter filter = new EndStringFilter(pattern);

        String testString = "Hello, world!";


        assertTrue(filter.apply(testString));
    }


    @Test
    void testApplyWithNonMatchingEnding() {
        String pattern = "world!";
        EndStringFilter filter = new EndStringFilter(pattern);

        String testString = "Hello, world";


        assertFalse(filter.apply(testString));
    }

    @Test
    void testApplyWithEmptyString() {
        String pattern = "world!";
        EndStringFilter filter = new EndStringFilter(pattern);

        String testString = "";

        assertFalse(filter.apply(testString));
    }

    @Test
    void testApplyWithEmptyPattern() {
        String pattern = "";
        EndStringFilter filter = new EndStringFilter(pattern);

        String testString = "Hello, world!";


        assertTrue(filter.apply(testString));
    }

    @Test
    void testApplyWithEqualStrings() {
        String pattern = "Test";
        EndStringFilter filter = new EndStringFilter(pattern);

        String testString = "Test";
        assertTrue(filter.apply(testString));
    }


    @Test
    void testApplyWithSubstringEnding() {
        String pattern = "lo";
        EndStringFilter filter = new EndStringFilter(pattern);

        String testString = "Hello";

        assertTrue(filter.apply(testString));
    }
}
