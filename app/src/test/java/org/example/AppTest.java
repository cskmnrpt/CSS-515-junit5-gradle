package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAdd() {
        App app = new App();
        assertEquals(8, app.add(5, 3), "5 + 3 should equal 8");
    }
}
