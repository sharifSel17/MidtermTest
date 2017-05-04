package problems;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        int count = 0;
        double sum = 0;
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String text = "house home blue house home values";

        List<String> list = Arrays.asList(text.split(" "));

        Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {

            System.out.println("Number of duplicate->"+word + ": " + Collections.frequency(list, word));

        }
        double charNum = text.length();
        sum = charNum + sum;
        count++;

        double average = 0;
        if (count > 0) {
            average = sum / count;
        }
        System.out.println("Average length of word: " + average);
    }

}
