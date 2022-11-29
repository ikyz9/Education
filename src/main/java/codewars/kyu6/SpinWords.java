package codewars.kyu6;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//6 kyu
//Stop gninnipS My sdroW!
//https://www.codewars.com/kata/5264d2b162488dc400000001
public class SpinWords {

    public static String firstSpinWordsSolution(String sentence) {
        StringBuilder newString = new StringBuilder();
        for (String word : sentence.split(" ")){
            if (word.length() >= 5){
                StringBuilder stringBuilder = new StringBuilder(word);
                stringBuilder.reverse();
                word = stringBuilder.toString();
            }
            newString.append(word);
            newString.append(" ");
        }
        return newString.substring(0, newString.length()-1);
    }

    public static String secondSpinWordsSolution(String sentence){
        return Stream.of(sentence.split(" "))
                .map(word -> word.length() >=5 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}
