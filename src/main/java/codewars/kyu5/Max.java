package codewars.kyu5;

//5 kyu
//Maximum subarray sum
//https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/

public class Max {

    //new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})
    public static int sequence(int[] arr) {
        if (arr.length == 0) { return 0; }

        int maxSum = 0, currentSum = 0;

        for (int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            if (currentSum > maxSum) { maxSum = currentSum; }
            if (currentSum < 0){ currentSum = 0; }
        }

        return maxSum != 0 ? maxSum : 0;
    }
}

