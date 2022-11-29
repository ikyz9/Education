package codewars.kyu6;

import java.util.Arrays;

//6 kyu
//Array.diff
//https://www.codewars.com/kata/523f5d21c841566fde000009
public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(elemA -> Arrays.stream(b).noneMatch(elemB -> elemA == elemB))
                .toArray();
    }
}
