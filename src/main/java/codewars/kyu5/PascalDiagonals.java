package codewars.kyu5;


import java.util.Arrays;

//5 kyu
//Pascal's Diagonals
//https://www.codewars.com/kata/576b072359b1161a7b000a17
public class PascalDiagonals {

    public static long[] generateDiagonal(int n, int l) {
        if (l == 0) { return new long[]{}; }
        if (n == 0) {
            long[] res = new long[l];
            Arrays.fill(res, 1);
            return res;
        }
        long[] res = new long[l];
        res[0] = 1;
        for(int i = 1; i < l; i++){
            res[i] = res[i-1] * (n + i) /i;
        }
        return res;
    }
}
