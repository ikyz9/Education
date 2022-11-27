package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import java.util.stream.IntStream;

public class CodewarsSolution {

    //6 kyu
    //Stop gninnipS My sdroW!
    //https://www.codewars.com/kata/5264d2b162488dc400000001
    public static String spinWords(String sentence){
        return Stream.of(sentence.split(" "))
                .map(word -> word.length() >=5 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }

    //6 kyu
    //Array.diff
    //https://www.codewars.com/kata/523f5d21c841566fde000009
    public static int[] arrayDiff(int[] a, int[] b) {

        return Arrays.stream(a)
                .filter(elemA -> Arrays.stream(b).noneMatch(elemB -> elemA == elemB))
                .toArray();
    }

    //6 kyu
    //Playing with digits
    //https://www.codewars.com/kata/5552101f47fc5178b1000050
    public static long digPow(int n, int p) {
        long sum = 0;
        String[] sepN = String.valueOf(n).split("");
        for(int i = 0; i < sepN.length; i++){
            sum += Math.pow(Double.parseDouble(sepN[i]), (p+i));
        }
        return sum % n == 0 ? sum / n : -1;
    }

    //5 kyu
    //Mean Square Error
    //https://www.codewars.com/kata/51edd51599a189fe7f000015
    public static double averageArraySquares(int[] arr1, int[] arr2){
        return IntStream.range(0, arr1.length)
                .mapToDouble(i -> Math.pow(arr1[i] - arr2[i], 2))
                .average()
                .getAsDouble();
    }

    //4 kyu
    //Number of Proper Fractions with Denominator d
    //https://www.codewars.com/kata/55b7bb74a0256d4467000070
    public static long properFractions(long denominator) {
        return LongStream.range(1, denominator)
                .filter(numerator -> GSMForPoperFractions(numerator, denominator) == 1)
                .count();
    }

    private static long GSMForPoperFractions(long numerator, long denominator){
        if (numerator == 0){ return denominator; }
        return  GSMForPoperFractions(denominator % numerator, numerator);
    }

    //5 kyu
    //Not very secure
    //https://www.codewars.com/kata/526dbd6c8c0eb53254000110
    public static boolean alphanumeric(String s){
        return s.matches("^[a-zA-Z0-9]+$");
    }


}
