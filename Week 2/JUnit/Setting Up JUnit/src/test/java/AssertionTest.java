import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssertionTest {

    @Test
    void testStringEquality() {
        String expected = "hello";
        String actual = "he" + "llo";
        assertEquals(expected, actual, "Strings should be equal");
    }

    @Test
    void testNumberComparison() {
        int result = 5 + 5;
        assertTrue(result > 5, "Result should be greater than 5");
    }

    @Test
    void testNullCheck() {
        Object obj = null;
        assertNull(obj, "Object should be null");
    }

    @Test
    void testArrayEquality() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assertArrayEquals(a, b, "Arrays should be equal");
    }
}
