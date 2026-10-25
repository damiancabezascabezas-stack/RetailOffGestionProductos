package cl.retailoff;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void verificarSumaDeProductos() {
        int producto1 = 15000;
        int producto2 = 25000;

        int total = producto1 + producto2;

        assertEquals(40000, total);
    }
}