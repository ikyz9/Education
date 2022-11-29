package codewars.kyu5;

import java.util.stream.IntStream;

//5 kyu
//Mean Square Error
//https://www.codewars.com/kata/51edd51599a189fe7f000015
public class AverageArraySquares {

    public static double firstAverageArraySquaresSolution(int[] arr1, int[] arr2) {
        double sum =0;
        for (int i =0; i< arr1.length; i++) {
            sum += Math.pow(arr1[i] - arr2[i], 2);
        }
        return sum / arr1.length;
    }

    public static double secondAverageArraySquaresSolution(int[] arr1, int[] arr2){
        return IntStream.range(0, arr1.length)
                .mapToDouble(i -> Math.pow(arr1[i] - arr2[i], 2))
                .average()
                .getAsDouble();
    }

}
