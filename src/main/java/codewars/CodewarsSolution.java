package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodewarsSolution {

    //6 kyu
    //Stop gninnipS My sdroW!
    public String spinWords(String sentence){
        return Stream.of(sentence.split(" "))
                .map(word -> word.length() >=5 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }

    //6 kyu
    //Array.diff
    public static int[] arrayDiff(int[] a, int[] b) {

        return Arrays.stream(a)
                .filter(elemA -> Arrays.stream(b).noneMatch(elemB -> elemA == elemB))
                .toArray();
    }

    //6 kyu
    //Playing with digits
    public static long digPow(int n, int p) {
        long sum = 0;
        String[] sepN = String.valueOf(n).split("");
        for(int i = 0; i < sepN.length; i++){
            sum += Math.pow(Double.parseDouble(sepN[i]), (p+i));
        }
        return sum % n == 0 ? sum / n : -1;
    }
}
