
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.example.Greet;

import static org.junit.jupiter.api.Assertions.*;

class GreetTest {

    private Greet greet;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up test...");
        greet = new Greet();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tearing down test...");
        greet = null;
    }

    @Test
    void testGreetWithName() {
        String result = greet.greet("Felix");
        assertEquals("Hello, Felix!", result);
    }

    @Test
    void testGreetDefault() {
        String result = greet.greetDefault();
        assertEquals("Hello, World!", result);
    }
}
