import codewars.CodewarsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodewarsSolutionTest {
    @Test
    public void spinWordsTest() {
        String sentence = "Hey fellow warriors";
        String expect = "Hey wollef sroirraw";
        Assertions.assertEquals(expect, new CodewarsSolution().spinWords(sentence));

    }
}
