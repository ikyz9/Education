package codewars;

import java.util.Arrays;

public class CodewarsSolution {

    //6 kyu
    //Stop gninnipS My sdroW!
    public String spinWords(String sentence){
        StringBuilder newString = new StringBuilder();
        for (String word : Arrays.asList(sentence.split(" "))){
            if (word.length() > 5){
                StringBuilder stringBuilder = new StringBuilder(word);
                stringBuilder.reverse();
                word = stringBuilder.toString();
            }
            newString.append(word + " ");
        }
        return newString.substring(0, newString.length()-1);
    }
}
