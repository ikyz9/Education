import codewars.CodewarsSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodewarsSolutionTest {

    @Test
    public void spinWordsTest() {
        String sentence = "Hey fellow warriors";
        String expect = "Hey wollef sroirraw";
        assertEquals(expect, CodewarsSolution.spinWords(sentence));

    }

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, CodewarsSolution.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, CodewarsSolution.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, CodewarsSolution.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, CodewarsSolution.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, CodewarsSolution.arrayDiff(new int [] {}, new int[] {1,2}));
    }

    @Test
    public void digPowTest() {
        assertEquals(1, CodewarsSolution.digPow(89, 1));
        assertEquals(-1, CodewarsSolution.digPow(92, 1));
        assertEquals(51, CodewarsSolution.digPow(46288, 3));

    }

    @Test
    public void averageArraySquaresTest() {
        int[] a1 = {1, 2, 3};
        int[] b1 = {4, 5, 6};
        assertEquals(9.0, CodewarsSolution.averageArraySquares(a1, b1), 1e-15);
        int[] a2 = {10, 20, 10, 2};
        int[] b2 = {10, 25, 5, -2};
        assertEquals(16.5, CodewarsSolution.averageArraySquares(a2, b2), 1e-15);
        int[] a3 = {0, -1};
        int[] b3 = {-1, 0};
        assertEquals(1.0, CodewarsSolution.averageArraySquares(a3, b3), 1e-15);
        int[] a4 = {10, 10};
        int[] b4 = {10, 10};
        assertEquals(0.0, CodewarsSolution.averageArraySquares(a4, b4), 1e-15);
    }


}
