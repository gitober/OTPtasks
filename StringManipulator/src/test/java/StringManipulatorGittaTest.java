import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringManipulatorGittaTest {

    private static StringManipulatorGitta manipulator;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        manipulator = new StringManipulatorGitta();
        System.out.println("Suoritetaan ennen testejä");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        manipulator = null;
        System.out.println("Testien siivous operaatio");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Enne testejä");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Testien siivousoperaatio");
    }

    @Test
    public void testReverse() {
        String result = manipulator.reverse("päeväää");
        assertEquals("iltaa", result);
    }

    @Test
    public void testCapitalize() {
        String result = manipulator.capitalize("Mitä kuuluu");
        assertEquals("mitä kuuluu", result);
    }
}
