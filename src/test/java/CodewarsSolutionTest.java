import codewars.kyu4.ProperFractions;
import codewars.kyu5.Alphanumeric;
import codewars.kyu5.AverageArraySquares;
import codewars.kyu5.PaginationHelper;
import codewars.kyu6.ArrayDiff;
import codewars.kyu6.DigPow;
import codewars.kyu6.SpinWords;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CodewarsSolutionTest {

    @Test
    public void spinWordsTest() {
        assertEquals("Hey wollef sroirraw", SpinWords.firstSpinWordsSolution("Hey fellow warriors"));
        assertEquals("Hey wollef sroirraw", SpinWords.secondSpinWordsSolution("Hey fellow warriors"));

    }

    @Test
    public void arrayDiffTest() {
        assertArrayEquals(new int[] {2}, ArrayDiff.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, ArrayDiff.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, ArrayDiff.arrayDiff(new int [] {}, new int[] {1,2}));
    }

    @Test
    public void digPowTest() {
        assertEquals(1, DigPow.digPow(89, 1));
        assertEquals(-1, DigPow.digPow(92, 1));
        assertEquals(51, DigPow.digPow(46288, 3));
    }

    @Test
    public void averageArraySquaresTest() {
        //test for first solution
        assertEquals(9.0, AverageArraySquares.firstAverageArraySquaresSolution(new int[]{1, 2, 3}, new int[]{4, 5, 6}), 1e-15);
        assertEquals(16.5, AverageArraySquares.firstAverageArraySquaresSolution(new int[]{10, 20, 10, 2}, new int[]{10, 25, 5, -2}), 1e-15);
        assertEquals(1.0, AverageArraySquares.firstAverageArraySquaresSolution(new int[]{0, -1}, new int[]{-1, 0}), 1e-15);
        assertEquals(0.0, AverageArraySquares.firstAverageArraySquaresSolution(new int[]{10, 10}, new int[]{10, 10}), 1e-15);
        //test for second solution
        assertEquals(9.0, AverageArraySquares.secondAverageArraySquaresSolution(new int[]{1, 2, 3}, new int[]{4, 5, 6}), 1e-15);
        assertEquals(16.5, AverageArraySquares.secondAverageArraySquaresSolution(new int[]{10, 20, 10, 2}, new int[]{10, 25, 5, -2}), 1e-15);
        assertEquals(1.0, AverageArraySquares.secondAverageArraySquaresSolution(new int[]{0, -1}, new int[]{-1, 0}), 1e-15);
        assertEquals(0.0, AverageArraySquares.secondAverageArraySquaresSolution(new int[]{10, 10}, new int[]{10, 10}), 1e-15);
    }

    @Test
    public void properFractionsTest() {
        assertEquals(0, ProperFractions.properFractions(1));
        assertEquals(1, ProperFractions.properFractions(2));
        assertEquals(4, ProperFractions.properFractions(5));
        assertEquals(8, ProperFractions.properFractions(15));
        assertEquals(20, ProperFractions.properFractions(25));
    }

    @Test
    public void validInputTest() {
        assertTrue(Alphanumeric.alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    @Test
    public void paginationHelperTest(){
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
        assertEquals(2, helper.pageCount());
        assertEquals(6, helper.itemCount());
        assertEquals(4, helper.pageItemCount(1));
        assertEquals(2, helper.pageItemCount(2));
        assertEquals(-1, helper.pageItemCount(3));
        assertEquals(2, helper.pageIndex(5));
        assertEquals(1, helper.pageIndex(2));
        assertEquals(-1, helper.pageIndex(20));
        assertEquals(-1, helper.pageIndex(-10));
        assertEquals(-1, helper.pageIndex(0));

    }

}
