import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest {

    @Test
    public void testSingleDimensionArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals(a1, a2, "Should be equal");
    }

    @Test
    public void testSingleDimensionArrayEquality2() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 9, 11, 7 };
        assertArrayEquals(a1, a2, "Wrong");
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { {2,3},{5,7},{11,13}};
        int[][] a12 = {{2,4},{5,2},{11,5}};
        assertArrayEquals(a11, a12, "Väärä vastaus");
    }

    @Test
    public void testStringArrayEquality() {
        String[] aakkoset1 = {"kiitos", "tästä", "tehtävästä"};
        String[] aakkoset2 = {"voi ei", "tästä", "tehtävästä"};
        assertArrayEquals(aakkoset1,aakkoset2,"Sama lause");
    }

    @Test
    public void testDoubleArrayEquality() {
        double[] d10 = { 2,45, 2,65, 5,78 };
        double[] d11 = { 2,45, 2,65, 5,78 };
        assertArrayEquals(d10,d11,"desimaalit ok");
    }


}