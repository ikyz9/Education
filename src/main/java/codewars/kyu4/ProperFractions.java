package codewars.kyu4;

import java.util.stream.LongStream;

//4 kyu
//Number of Proper Fractions with Denominator d
//https://www.codewars.com/kata/55b7bb74a0256d4467000070
public class ProperFractions {

    public static long properFractions(long denominator) {
        return LongStream.range(1, denominator)
                .filter(numerator -> GSMForPoperFractions(numerator, denominator) == 1)
                .count();
    }

    private static long GSMForPoperFractions(long numerator, long denominator){
        if (numerator == 0){ return denominator; }
        return  GSMForPoperFractions(denominator % numerator, numerator);
    }
}
