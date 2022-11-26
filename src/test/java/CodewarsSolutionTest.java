import codewars.CodewarsSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodewarsSolutionTest {

    CodewarsSolution codewarsSolution = new CodewarsSolution();

    @Test
    public void spinWordsTest() {
        String sentence = "Hey fellow warriors";
        String expect = "Hey wollef sroirraw";
        assertEquals(expect, codewarsSolution.spinWords(sentence));

    }

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2}, codewarsSolution.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, codewarsSolution.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, codewarsSolution.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, codewarsSolution.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, codewarsSolution.arrayDiff(new int [] {}, new int[] {1,2}));
    }

    @Test
    public void Test1() {
        assertEquals(1, codewarsSolution.digPow(89, 1));
        assertEquals(-1, codewarsSolution.digPow(92, 1));
        assertEquals(51, codewarsSolution.digPow(46288, 3));

    }
}
