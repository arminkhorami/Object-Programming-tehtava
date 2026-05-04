import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    StringManipulator sm = new StringManipulator();

    @Test
    void testConcatenate() {
        assertEquals("HelloWorld", sm.concatenate("Hello", "World"));
    }

    @Test
    void testFindLength() {
        assertEquals(5, sm.findLength("Hello"));
    }

    @Test
    void testUpperCase() {
        assertEquals("HELLO", sm.convertToUpperCase("hello"));
    }

    @Test
    void testLowerCase() {
        assertEquals("hello", sm.convertToLowerCase("HELLO"));
    }

    @Test
    void testContains() {
        assertTrue(sm.containsSubstring("Hello World", "World"));
        assertFalse(sm.containsSubstring("Hello", "xyz"));
    }
}