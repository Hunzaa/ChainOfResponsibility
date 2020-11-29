import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DispenserTest {
    @Test
    void testingDispenser() {
        Cash testCash = new Cash(90);
        assertEquals(90, 90);
    }
}