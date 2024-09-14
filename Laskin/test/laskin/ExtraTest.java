package laskin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExtraTest extends AbstractParent {

    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001; // Delta for floating-point comparisons

    @BeforeAll
    public static void testVirtaON() {
        System.out.println("@BeforeAll Virta ON (ennen ensimmäistä testiä)");
        laskin.virtaON();
    }

    @AfterAll
    public static void testVirtaOFF() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        assertEquals(0, laskin.annaTulos(), "Nollaus ei onnistunut");
    }

    @ParameterizedTest(name = "Testaa neliö - {0} neliö on {1}")
    @CsvSource({
            "2, 4",
            "4, 16",
            "5, 25"
    })
    public void testNelio(double input, double expected) {
        laskin.nelio(input);
        assertEquals(expected, laskin.annaTulos(), DELTA, "Neliöön korotus väärin");
    }

    @ParameterizedTest(name = "Testaa neliöjuuri - {0} neliöjuuri on {1}")
    @CsvSource({
            "2, 1.414",
            "9, 3.0",
            "16, 4.0"
    })
    public void testNeliojuuri(double input, double expected) {
        laskin.neliojuuri(input);
        assertEquals(expected, laskin.annaTulos(), DELTA, "Neliöjuuren laskenta väärin");
    }

    @Test
    @DisplayName("Testaa negatiivinen neliöjuuri")
    public void testNeliojuuriNegat() {
        assertThrows(IllegalArgumentException.class, () -> laskin.neliojuuri(-4));
    }
}
