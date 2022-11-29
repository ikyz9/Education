package codewars.kyu6;

//6 kyu
//Playing with digits
//https://www.codewars.com/kata/5552101f47fc5178b1000050
public class DigPow {

    public static long digPow(int n, int p) {
        long sum = 0;
        String[] sepN = String.valueOf(n).split("");
        for(int i = 0; i < sepN.length; i++){
            sum += Math.pow(Double.parseDouble(sepN[i]), (p+i));
        }
        return sum % n == 0 ? sum / n : -1;
    }

}
