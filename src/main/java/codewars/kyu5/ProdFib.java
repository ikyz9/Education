package codewars.kyu5;


//5 kyu
//Product of consecutive Fib numbers
//https://www.codewars.com/kata/5541f58a944b85ce6d00006a
public class ProdFib {
    public static long[] productFib(long prod) {
        long firstNumber = 0, secondNumber = 1;

        while(prod >= firstNumber * secondNumber){
            secondNumber += firstNumber;
            firstNumber = secondNumber - firstNumber;
        }
        return new long[]{firstNumber, secondNumber, firstNumber * secondNumber == prod ? 1 : 0};
    }
}